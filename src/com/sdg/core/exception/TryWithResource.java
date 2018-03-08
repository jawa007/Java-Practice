package com.sdg.core.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(
				"F:\\WORK\\JAVA\\Test\\src\\com\\sdg\\core\\exception\\journaldev.txt"))) {
			System.out.println(br.readLine());
		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
