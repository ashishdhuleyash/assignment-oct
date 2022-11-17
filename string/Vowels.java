package com.yash.assignment.string;

import java.util.Scanner;

public class Vowels {

	public static String removeVowel(String s) {
		String c=" ";
		String vowel="aeiouAEIOU";
		for( int i=0;i< s.length();i++){
			if( vowel.indexOf(s.charAt(i)) ==-1){
				c+=s.charAt(i);
			}

		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.next();
		System.out.print(Vowels.removeVowel(s));

	}
}