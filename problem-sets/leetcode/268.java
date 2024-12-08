class Solution {
    public static int missingNumber(int[] nums) {
        // Using Cycle Sort
        int i = 0, n = nums.length;
        while (i < n) {
            int correctpos = nums[i];
            if (nums[i] < n && nums[i] != nums[correctpos]) {
                int swapper = nums[i];
                nums[i] = nums[correctpos];
                nums[correctpos] = swapper;
            }
            else i++;
        }
        i = 0;
        while (i < n) {
            if (nums[i] != i) {
                return i;
            }
            i++;
        }
        return i;
    }
}


// Bitwise solution

/**
 * class Solution {
    public static int missingNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
            nums[0] ^= i;
        }
        return nums[0] ^ nums.length;
    }
}
 */