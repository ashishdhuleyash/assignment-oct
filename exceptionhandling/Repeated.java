package com.yash.assignment.exceptionhandling;

public class Repeated {
	public static void getDuplicates(String S) {
		int count = 0;
		String t = "";
		for (int i = 0; i < S.length() - 1; i++) {
			for (int j = i + 1; j < S.length(); j++) {
				if (S.charAt(i) == S.charAt(j) && !t.contains(S.charAt(j) + "")) {
					count++;
					t = t + S.charAt(i);
				}
			}
		}
		System.out.println(t);

		System.out.println(count);
	}

	public static void main(String[] args){
		Repeated.getDuplicates("nnavnath");

	}
}

