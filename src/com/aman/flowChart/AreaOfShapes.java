package com.aman.flowChart;

public class AreaOfShapes {
	public void areaOfSquare(double a) {
		double area = a * a;
		System.out.println("area of square : " + area);
	}

	public void areaOfRectangle(double l, double b) {
		double area = l * b;
		System.out.println("area of rectengle : " + area);
	}

	public static void main(String[] args) {
		AreaOfShapes a = new AreaOfShapes();
		a.areaOfSquare(4);
		a.areaOfRectangle(3, 4);
	}

}
