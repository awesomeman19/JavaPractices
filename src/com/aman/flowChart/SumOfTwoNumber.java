package com.aman.flowChart;

public class SumOfTwoNumber {

	public int sumOfTwoNumber(int a, int b) {
		return a + b;

	} 

	public static void main(String[] args) {
		SumOfTwoNumber s = new SumOfTwoNumber();
		int sum1=s.sumOfTwoNumber(3, 5);
		int sum2=s.sumOfTwoNumber(4, 8);
		System.out.println(sum1+"\n"+sum2);
	}

}
