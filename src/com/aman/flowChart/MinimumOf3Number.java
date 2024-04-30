package com.aman.flowChart;

public class MinimumOf3Number {
	public int minimumOf3Number(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a) {
			return b;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {
		MinimumOf3Number m = new MinimumOf3Number();
		int num1 = m.minimumOf3Number(4, 5, 6);
		System.out.println(num1);
		int num2 = m.minimumOf3Number(3, 5, 3);
		System.out.println(num2);

	}

}
