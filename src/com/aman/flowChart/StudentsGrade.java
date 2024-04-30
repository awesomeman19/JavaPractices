package com.aman.flowChart;

public class StudentsGrade {
	public void studentsGrade(int n) {
		if (n >= 75) {
			System.out.println("A");
		} else if (n >= 65 && n < 75) {
			System.out.println("B");
		} else if (n >= 55 && n < 65) {
			System.out.println("C");
		} else if (n >= 45 && n < 55) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	public static void main(String[] args) {
		StudentsGrade s = new StudentsGrade();
		s.studentsGrade(87);
		s.studentsGrade(56);
		s.studentsGrade(23);
		s.studentsGrade(44);
		s.studentsGrade(66);
		s.studentsGrade(55);
		s.studentsGrade(48);
	}

}
