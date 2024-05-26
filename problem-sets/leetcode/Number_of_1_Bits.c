int hammingWeight(int n) {
    int m = 0;
    for (int i = 0; i < sizeof(int) * 8; i++){
        if ((n & 1) == 1) m++;
        n >>= 1;
    }
    return m;
}