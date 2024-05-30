#include <math.h>

int divide(int dividend, int divisor) {
    // Range: [-pow(2, 31), pow(2, 31) - 1]
    if (divisor == 1) return dividend;
    
    
    // Edge case
    if (dividend == -pow(2, 31) && divisor == -1) return pow(2, 31) - 1;
    
    // Storing the sign
    signed int quotient = 0;
    int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
    
    // Taking absolute values
    long abs_dividend = labs(dividend);
    long abs_divisor = labs(divisor);
    
    // i represents each digits place in the Binary representation
    unsigned int i;
    while (abs_dividend >= abs_divisor) {
        i = 1;
        while (2 * i * abs_divisor <= abs_dividend) i <<= 1;
        abs_dividend -= i * abs_divisor;
        quotient += i;
    }
    
    return quotient * sign;
    
}