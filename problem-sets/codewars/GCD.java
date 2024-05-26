public class GCD {
    public static int compute(int x, int y) {
        int i=0;
        for (int n=1;(n<=x && n<=y);n++){
          if (x%n==0 && y%n==0){
            i = n;
          }
        }
        return i;
    }
}