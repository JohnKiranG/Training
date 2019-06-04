package com.john.stringoperations;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is john", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
