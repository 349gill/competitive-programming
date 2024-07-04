class Solution {
    public static int missingNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
            nums[0] ^= i;
        }
        return nums[0] ^ nums.length;
    }
}
