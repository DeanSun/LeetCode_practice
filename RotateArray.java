class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k == 0) {
			return;
		}
		int temp = 0;
		for (int i = nums.length; i > 0; i--) {
			if (i == nums.length) {
				temp = nums[i - 1];
			}
			if (i >= 2) {
				nums[i - 1] = nums[i - 2];
			}
			if (i == 1) {
				nums[0] = temp;
				if (k > 1) {
					k--;
					i = nums.length + 1;
				}
			}
		}
    }
}