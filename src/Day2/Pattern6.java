package Day2;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//* * * * *
		//	  * * * *
		//		  * * *
		//			  * *
		//				  *
		//initialization
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
		
		while(row<=n) {
			// space printing
			 int i = 1;
			 	while (i <= space) {
			 		System.out.print("  ");
					i++;
			}
			 // star printing
				int j = 1;
				while (j <= star) {
					System.out.print("* ");
					j++;
				}
				//next row prepration
			 	System.out.println();
			 	row++;
			 	space+=2;
			 	star--;
		}
	}
}
