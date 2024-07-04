class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1]; // DP Array
        int most_significant_bit = 1;
        for (int i = 1; i < n + 1; i++) {
            most_significant_bit = most_significant_bit * 2 == i ? i : most_significant_bit;
            arr[i] = 1 + arr[i - most_significant_bit];
        }
        return arr;
    }
}