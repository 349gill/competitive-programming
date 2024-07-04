class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        
        int sum, digit;
        while (!numbers.contains(n)) {
            sum = 0;
            numbers.add(n);
            while (n != 0) {
                digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            if (n == 1) return true;
        }
        return false;
    }
}