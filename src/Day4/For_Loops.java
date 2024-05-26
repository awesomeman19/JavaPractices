package Day4;

public class For_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		for (int i = 1; i <= 5;) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------------------------------");
		int i=1;
		for (; i <= 5;) {
			System.out.println(i);
			i++;
		}

	}

}
