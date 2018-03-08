//package com.core.file.program;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//import org.apache.commons.io.FileUtils;
//
//public class ReadTextFileReader {
//	//First Approach
//	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
//		Scanner sc = new Scanner(file);
//
//		// we just need to use \\Z as delimiter
//		sc.useDelimiter("\\Z");
//		while (sc.hasNextLine())
//		      System.out.println(sc.nextLine());
//	}
//	//Second Approach
////	public static void main(String[] args)throws Exception
////	  {
////	  // We need to provide file path as the parameter:
////	  // double backquote is to avoid compiler interpret words
////	  // like \test as \t (ie. as a escape sequence)
////	  File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
////	 
////	  BufferedReader br = new BufferedReader(new FileReader(file));
////	 
////	  String st;
////	  while ((st = br.readLine()) != null)
////	    System.out.println(st);
////	  }
//	//Third Approach
//	
//	
////	Streaming with Apache Commons IO
////
////	The same can be achieved using the Commons IO library as well, by using the custom LineIterator provided by the library:
////	
////		
////	LineIterator it = FileUtils.lineIterator(theFile, "UTF-8");
////	try {
////	    while (it.hasNext()) {
////	        String line = it.nextLine();
////	        // do something with line
////	    }
////	} finally {
////	    LineIterator.closeQuietly(it);
////	}
//}
