package com.yash.assignment.day1;

import java.util.Scanner;

public class Conversion {

	int bin[] = new int[100], i = 0;



	void binary(int num) {
		if (num > 0) {
			bin[i++] = num % 2;
			num = num / 2;
			binary(num);
		}
		for (i = i - 1; i >= 0; i--) {
			System.out.print(bin[i]);
		}
		//System.out.println();
	}



	public static int binaryToDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
	}



	public static void main(String arg[]) {
		Conversion d = new Conversion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number");
		int n = sc.nextInt();



		System.out.println("Binary number is : ");
		d.binary(n);
		System.out.println();

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Binary number");
		int num=s.nextInt();
		System.out.println("Decimal number is:");
		System.out.println(Conversion.binaryToDecimal(num));
	}
}

