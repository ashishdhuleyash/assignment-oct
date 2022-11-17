package com.yash.assignment.string;

public class HeapMemory {
	public static void main(String[] args) {
		String s1 = "Ashish";
		String s2 = "Ashish";
		System.out.println("On the Basis of Memory");
		if (s1 == s2)
			System.out.println("Both are equal And stored in scp memory");
		else
			System.out.println("Both are not equals");
		System.out.println("Memory Address " + s1.hashCode());
		System.out.println("Memory Address " + s2.hashCode());
		String s3 = new String("Navnath");
		String s4 = new String("Navnath");
		if (s3 == s4)
			System.out.println("Both are Equal");
		else
			System.out.println("Both are not Equals");
		if(s3.equals(s4));
		System.out.println();
		System.out.println("memory Address "+s3.hashCode());
		System.out.println("Memory Address "+s4.hashCode());
	}
}

