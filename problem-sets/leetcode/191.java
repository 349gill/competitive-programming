class Solution {
    public int hammingWeight(int n) {
        int i = 0;
        while (n != 0) {
            n &= (n - 1);
            i++;
        } return i;
    }
}