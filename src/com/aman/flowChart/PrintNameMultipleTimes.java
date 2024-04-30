package com.aman.flowChart;

public class PrintNameMultipleTimes {
	public void printNameMultipleTimes(int n) {
		int Count = 1;
		while (Count <= n) {
			System.out.println("Your_Good_Name");
			Count++;
		}
	}

	public static void main(String[] args) {
		PrintNameMultipleTimes p = new PrintNameMultipleTimes();
		p.printNameMultipleTimes(5);
	}

}
