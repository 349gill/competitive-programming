class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length, carry = 1, sum = 0;
        int[] result = new int[n + 1];

        for (int i = 0; i < n; i++) {
            sum = digits[n - 1 - i] + carry;
            if (sum > 9) {
                result[n - i] = sum % 10;
                carry = sum / 10;
            }
            else {
                result[n - i] = sum;
                carry = 0;
            }
        }
        
        if (carry != 0) result[0] += carry;
        
        if (result[0] == 0) {
            for (int i = 0; i < n; i++) digits[i] = result[i + 1];
            result = digits;
        }
        return result;
    }
}