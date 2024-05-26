package Day4;

import java.util.Scanner;

public class GcdOrHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend : ");
		int dividend = sc.nextInt();
		
		System.out.print("Enter divisor  : ");
		int divisor = sc.nextInt();

		//int dividend = 60;
		//int divisor = 36;	
		/*while ((dividend % divisor) != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		} */
		for(; dividend%divisor !=0;) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		
		System.out.println(divisor);
	}

}
