package com.yash.assignment.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();

		String array[] = new String[size];
		System.out.println("Enter elements of the array: ");

		for(int i=0; i<size; i++)
		{
			array[i] = sc.next();
		}
		System.out.println(Arrays.toString(array));
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		System.out.println("Enter the element that is to be added:");
		String element = sc.next();
		list.add(element);
		array = list.toArray(array);
		System.out.println(Arrays.toString(array));
	}

}



