package Day8;

//goldman, uber, amex cisco, paytm,servicenow, oracle,intuit,intel,samsung,meda.net,c3iot,epam System,makemytrip,airbnb
public class ProductofArrayExceptSelf238 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] answer = product(nums);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}

	}

	public static int[] product(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}

		int[] right = new int[n];
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < n; i++) {
			left[i] = left[i] * right[i];
		}
		return left;
	}
}
