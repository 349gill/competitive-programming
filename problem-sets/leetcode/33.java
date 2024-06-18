class Solution {
    public int search(int[] nums, int target) {
        
        int L = 0, R = nums.length - 1, M, pivot = 0;
        
        while (L <= R) {
            if (nums[L] < nums[R]) {
                pivot = (nums[L] < nums[pivot]) ? L : pivot;
                break;
            }
            
            M = (L + R) / 2;
            pivot = (nums[M] < nums[pivot]) ? M : pivot;
            
            if (nums[M] < nums[L]) {
                R = M - 1;
            }
            else {
                L = M + 1;
            }
        }
        
        // Left part
        L = 0; R = pivot - 1;
        while (L <= R) {
            M = (L + R) / 2;
            if (nums[M] == target) {
                return M;
            }
            if (nums[M] < target) {
                L = M + 1;
            }
            else {
                R = M - 1;
            }
        }
        
        // Right part
        L = pivot; R = nums.length - 1;
        while (L <= R) {
            M = (L + R) / 2;
            if (nums[M] == target) {
                return M;
            }
            else if (nums[M] < target) {
                L = M + 1;
            }
            else {
                R = M - 1;
            }
        }
        
        return -1;
    }
}