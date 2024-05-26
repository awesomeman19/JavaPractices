package Day8;

//Input:nums=[1,2,3,4,5,6,7],k=3 //last 3 
//Output:[5,6,7,1,2,3,4]
public class RotateArray189 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("Before : ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		int k = 3;
		System.out.println(" ");
		System.out.print("After :  ");
		rotateArray189(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static void rotateArray189(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		for (int j = 0; j < k; j++) {
			int item = nums[n - 1];
			for (int i = n - 2; i >= 0; i--) {
				nums[i + 1] = nums[i];
			}
			nums[0] = item;
		}
	}

}
