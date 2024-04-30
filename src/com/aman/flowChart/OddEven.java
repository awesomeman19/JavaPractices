package com.aman.flowChart;

public class OddEven {
	public void oddEven(int n) {

		if (n % 2 == 0) {
			System.out.println("Given Number is Even Number!");
		} else {
			System.out.println("Given Number is Odd Number!");
		}

	}

	public static void main(String[] args) {
		OddEven o = new OddEven();
		o.oddEven(5);
		o.oddEven(6);
		o.oddEven(0);
	}

}
