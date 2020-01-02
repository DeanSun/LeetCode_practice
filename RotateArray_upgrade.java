class RotateArray_upgrade {
	public void rotate(int[] nums, int k) {
		k %= num.length;

		nums = reverseArrays(nums, 0, nums.length - 1);
		nums = reverseArrays(nums, 0, k - 1);
		nums = reverseArrays(nums, k, nums.length - 1);
	}

	private int[] reverseArrays(int[] nums, int begin, int end) {
		while (begin < end) {
			int temp = nums[begin];
			nums[begin] = nums[end];
			nums[end] = temp;
			begin++;
			end--;
		}
		return nums;
	}
}