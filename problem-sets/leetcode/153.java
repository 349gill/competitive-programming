class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1, mid = 0, min = nums[0];
        while (left <= right) {
            if (nums[left] < nums[right]) {
                return Math.min(nums[left], min);
            }
            mid = (left + right) / 2;
            min = Math.min(nums[mid], min);
            if (nums[mid] < nums[left]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return min;
    }
}