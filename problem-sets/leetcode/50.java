class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0 || x == 1) return 1;
        if (x == -1) {
            if (n % 2 == 0) return 1;
            else return -1;
        }
    
        if (n == Integer.MIN_VALUE) return 0.0;
    
        double result = 1.0;

        if (n > 0) {
            for (int i = 0; i < n; i++) result *= x;
            return result;
        }
        else {
            for (int i = 0; i < -n; i++) result /= x;
            return result;
        }
    }
}