package com.thread.countdown.latch;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

public class FolderScan implements Runnable {
	 private String path;
	    private BlockingQueue<File> queue;
	    private CountDownLatch latch;
	    private File endOfWorkFile;

	    FolderScan(String path, BlockingQueue<File> queue, CountDownLatch latch,
	            File endOfWorkFile) {
	        this.path = path;
	        this.queue = queue;
	        this.latch = latch;
	        this.endOfWorkFile = endOfWorkFile;
	    }

	    public FolderScan() {
	    }

	    @Override
	    public void run() {
	        findFiles(path);
	        queue.add(endOfWorkFile);
	        latch.countDown();
	    }

	    private void findFiles(String path) {

	        try {
	            File root = new File(path);
	            File[] list = root.listFiles();
	            for (File currentFile : list) {
	                String s = currentFile.getName().toLowerCase();
	                if (currentFile.isDirectory()) {
	                    findFiles(currentFile.getAbsolutePath());
	                } else {
	                    if (s.matches("^.*?\\.(txt|pdf|doc|docx|html|htm|xml|djvu|rar|rtf)$")) {
	                        queue.put(currentFile);
	                    }
	                }
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	    }
}
