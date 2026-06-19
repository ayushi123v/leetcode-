class Solution {
    public int findMin(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private int helper(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;

        int leftMin = helper(nums, left, mid);
        int rightMin = helper(nums, mid + 1, right);

        return Math.min(leftMin, rightMin);
    }
}