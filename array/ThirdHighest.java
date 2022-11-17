package com.yash.assignment.array;

public class ThirdHighest {
	public static void main(String[] args) {

		int arr[] = {1,5,6,2,3,4};

		int k = 3;

		for (int i = 0; i < arr.length-1; i++) {

			for (int j = 1; j < arr.length; j++) {

				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			if(i == k-1) {
				System.out.println(arr[i]);
				break;
			}
		}


	}
}


