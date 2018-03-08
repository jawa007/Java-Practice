package com.core.java.datastructure;

public class ConsecutiveDuplicatesString {

	public static void main(String[] args) {
		String str = "geeksforgeeg";
		// removeDuplicate(str);
		char input[] = str.toCharArray();
		int len = removeDuplicates(input);
		for (int i = 0; i < len; i++) {
			System.out.print(input[i] + " ");
		}
	}

	private static void removeDuplicate(String str) {
		String ans = "";
		int size = str.length();
		for (int i = 0; i < size - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				ans = ans + str.charAt(i);
			}
		}

		System.out.println(ans);
	}

	public static int removeDuplicates(char input[]) {
		int slow = 0;
		int fast = 0;
		int index = 0;
		while (fast < input.length) {
			while (fast < input.length && input[slow] == input[fast]) {
				fast++;
			}
			input[index++] = input[slow];
			slow = fast;
		}
		return index;
	}
}
