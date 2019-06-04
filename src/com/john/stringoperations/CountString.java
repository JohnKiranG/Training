//it is used to count diff things in a given string
package com.john.stringoperations;

public class CountString {

	public static void main(String[] args) {
		String s = "Hello, how are you?";

		int vowels = 0, consonants = 0, numbers = 0, others = 0, total = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				vowels++;
			} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				consonants++;
			} else if (c >= 0 && c <= 9) {
				numbers++;
			} else {
				others++;
			}

		}
		String words[] = s.split("\\s");
		System.out.println("words: " + words.length);

		total = vowels + consonants + numbers + others;
		System.out.println("String length: " + s.length());
		System.out.println("vowels: " + vowels);
		System.out.println("consonants" + consonants);
		System.out.println("numbers: " + numbers);
		System.out.println("others: " + others);
		if (total == s.length()) {
			System.out.println("Total is equal to length: " + total);
		} else {
			System.out.println("Total is not equal to length: " + total);
		}

	}
}
