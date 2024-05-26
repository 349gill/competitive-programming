class RowSumOddNumbers {
  public static int rowSumOddNumbers(int n) {
    int sum = n*(n-1)+1;
    for (int i=1;i<n;i++) {
      sum += n*(n-1) + 2*(i) + 1;
    }
    return sum;
  }
}