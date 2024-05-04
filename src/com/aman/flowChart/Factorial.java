package com.aman.flowChart;

public class Factorial {
	public void factorial(int N) {
		int F = 1;

		for (int Count = 1; Count <= N; Count++) {
			F = F * Count;
		}
		System.out.println(F);
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.factorial(4);
	}

}
