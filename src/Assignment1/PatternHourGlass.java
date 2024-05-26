package Assignment1;

public class PatternHourGlass {

	public static void main(String[] args) {
		//5 4 3 2 1 0 1 2 3 4 5
        //  4 3 2 1 0 1 2 3 4 
        //    3 2 1 0 1 2 3 
        //      2 1 0 1 2 
        //        1 0 1 
        //          0 
        //        1 0 1 
        //      2 1 0 1 2 
        //    3 2 1 0 1 2 3 
        //  4 3 2 1 0 1 2 3 4 
        //5 4 3 2 1 0 1 2 3 4 5
		
		int n = 5;
		int row = 5;
		int star = 2*n+1;
		int space = 0;
		int totalrows = 2*n+1; 
		while (row <= totalrows) {
			// star printing
			
						int j = 1;
						while (j <= star) {
							if(row<=n) {
								System.out.print(row);
							    row--;
							}else {
								//row++;
								System.out.print(row);
								row++;
							}
							j++;
							
						}
			// space printing
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			
			// next row prepration
			System.out.println();
			row++;
			space++;
			star -= 2;
	}
}
}