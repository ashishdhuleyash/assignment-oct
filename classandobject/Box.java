package com.yash.assignment.classandobject;

public class Box {
	private int width ;
	private int height ;
	private int depth;

	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double getVolume() {  
		return width * height * depth;  
	}  
}
