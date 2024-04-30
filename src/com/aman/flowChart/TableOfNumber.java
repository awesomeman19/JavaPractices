package com.aman.flowChart;

public class TableOfNumber {
	public void tableOfNumber(int N) {
		int Count = 1;
		while (Count <= 10) {
			System.out.println(N * Count);
			Count++;
		}
	}

	public void tableOfNumberWithExclusion(int N) {

		for (int Count = 1; Count <= 10; Count++) {
			int m = N * Count;
			if (!(m % 4 == 0)) {
				System.out.println(m);
				Count++;
			}

		}

	}

	public static void main(String[] args) {
		TableOfNumber t = new TableOfNumber();
		t.tableOfNumber(6);
		System.out.println("_____________________________");
		t.tableOfNumberWithExclusion(6);
	}

}
