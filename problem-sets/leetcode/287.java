class Solution {
    public int findDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return -1;
        }
        
        // Floyd's Cycle Finding Algorithm for Linked Lists

        int p1 = nums[0];
        int p2 = nums[p1];
        
        while (p1 != p2) {
            p1 = nums[p1];
            p2 = nums[nums[p2]];
        }
        
        p1 = 0;
        while (p1 != p2) {
            p1 = nums[p1];
            p2 = nums[p2];
        }
        return p1;
    }
}