
package com.aman.flowChart;

public class PrintNaturalNumbers {
	public void printNaturalNumbers(int N) {
		int Count = 1;
		while (Count <= N) {
			System.out.println(Count);
			Count++;
		}
	}

	public static void main(String[] args) {
		PrintNaturalNumbers p = new PrintNaturalNumbers();
		p.printNaturalNumbers(10);
	}

}
