package com.aman.flowChart;

public class SumOfNaturalNumber {
	public int sumOfNaturalNumber(int N) {

		int Count = 1, Sum = 0;
		while (Count <= N) {
			Sum = Sum + Count;
			Count++;
		}
		return Sum;
	}

	public static void main(String[] args) {
		SumOfNaturalNumber s = new SumOfNaturalNumber();
		int Sum = s.sumOfNaturalNumber(100);
		System.out.println(Sum);

	}

}
