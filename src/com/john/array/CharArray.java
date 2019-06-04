package com.john.array;

import java.util.Scanner;

public class CharArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch[] ;
		ch = input.nextLine().toCharArray();
		System.out.println(ch);
		for (int count = 0; count < ch.length; count++) {
			System.out.println(ch[count]);
		}
		input.close();
	}
}
