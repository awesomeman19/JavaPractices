package Day8;

//prefix suffix concept
public class TrappingRainWater42 {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int answer = trappingRainWater42(height);
		System.out.println(answer);

	}

	public static int trappingRainWater42(int[] height) {
		int n = height.length;
		int[] left = new int[n];// left array formation
		left[0] = height[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], height[i]);
		}

		int[] right = new int[n];// right array formation
		right[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], height[i]);
		}
		int waterVolume = 0;
		for (int i = 0; i < n; i++) {
			waterVolume = waterVolume + Math.min(left[i], right[i]) - height[i];
		}
		return waterVolume;
	}
}
