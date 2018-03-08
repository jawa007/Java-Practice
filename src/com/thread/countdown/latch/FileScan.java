package com.thread.countdown.latch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class FileScan implements Runnable {
	private String whatFind;
    private BlockingQueue<File> queue;
    private CountDownLatch latch;
    private File endOfWorkFile;

    public FileScan(String whatFind, BlockingQueue<File> queue,
            CountDownLatch latch, File endOfWorkFile) {
        this.whatFind = whatFind;
        this.queue = queue;
        this.latch = latch;
        this.endOfWorkFile = endOfWorkFile;
    }

    public FileScan() {
    }

    @Override
    public void run() {

        while (true) {
            try {
                File file;
                file = queue.take();

                if (file == endOfWorkFile) {
                    break;
                }

                scan(file);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        latch.countDown();
    }

    private void scan(File file) {
        Scanner scanner = null;
        int matches = 0;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            e.printStackTrace();
        }

        while (scanner.hasNext())
            if (scanner.next().equals(whatFind)) {
                matches++;
            }

        if (matches > 0) {
            String myStr = String.format(
                    "File: %s - and the number of matches " + "is: %d",
                    file.getAbsolutePath(), matches);
            System.out.println(myStr);
        }
    }

    public void askUserPathAndWord() {

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        String path;
        String whatFind;
        BlockingQueue<File> queue = new LinkedBlockingQueue<File>();

        try {
            System.out.println("Please, enter a Path and Word"
                    + "(which you want to find):");
            System.out.println("Please enter a Path:");
            path = bufferedReader.readLine();
            System.out.println("Please enter a Word:");
            whatFind = bufferedReader.readLine();

            if (path != null && whatFind != null) {

                File endOfWorkFile = new File("GameOver.tmp");
                CountDownLatch latch = new CountDownLatch(2);

                FolderScan folderScan = new FolderScan(path, queue, latch,
                        endOfWorkFile);
                FileScan fileScan = new FileScan(whatFind, queue, latch,
                        endOfWorkFile);

                Executor executor = Executors.newCachedThreadPool();
                executor.execute(folderScan);
                executor.execute(fileScan);

                latch.await();
                System.out.println("Thank you!");
            } else {
                System.out.println("You did not enter anything");
            }

        } catch (IOException | RuntimeException e) {
            System.out.println("Wrong input!");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {  
        new FileScan().askUserPathAndWord();
    }
}
