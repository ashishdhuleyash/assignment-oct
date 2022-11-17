package com.yash.assignment.string;

public class GarbageCollection {
	@Override
	public void finalize() {
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {

		GarbageCollection s1 = new GarbageCollection();
		System.out.println(s1.hashCode());
		s1 = null;

		System.gc();

	}
}