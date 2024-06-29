class Solution {
    public int firstMissingPositive(int[] nums) {
        // Using Cycle Sort
        
        int n = nums.length;
        int i = 0, index, swap;
        
        while (i < n) {
            index = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[index]) {
                swap = nums[i];
                nums[i] = nums[index];
                nums[index] = swap;
            }
            else {
                i++;
            }
        }
        
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return ++i;
            }
        }
        return ++n;
    }
}