package com.yash.assignment.classandobject;

public class ComplexNumbers {
	double RealNumber;
	double imaginaryNumber;

	public ComplexNumbers(double real, double imag) {
		this.RealNumber = real;
		this.imaginaryNumber = imag;
	}

	public static void main(String[] args) {
		ComplexNumbers n1 = new ComplexNumbers(1.5, 3.4);
		ComplexNumbers n2 = new ComplexNumbers(2.4, 9.0),
				 temp;

		temp = add(n1, n2);

		System.out.printf("Sum = %.1f + %.1fi", temp.RealNumber, temp.imaginaryNumber);
	}

	public static ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2) {
		ComplexNumbers temp = new ComplexNumbers(0.0, 0.0);

		temp.RealNumber = n1.RealNumber + n2.RealNumber;
		temp.imaginaryNumber = n1.imaginaryNumber + n2.imaginaryNumber;

		return (temp);
	}
}

