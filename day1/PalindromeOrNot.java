package com.yash.assignment.day1;

import java.util.Scanner;



public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0, a;
		int temp = n;    
		while(n>0)
		{    
			a = n % 10;   
			sum = (sum*10)+a;    
			n = n/10;    
		}    
		if(temp==sum)    
			System.out.println(sum+ "  Is a Palindrome number.");    
		else    
			System.out.println(sum+" Not a palindrome number");    

	}

}
