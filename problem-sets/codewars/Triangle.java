// https://www.codewars.com/kata/56606694ec01347ce800001b

class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    if (a+b>c && b+c>a && a+c>b){
      return true;
    }
    return false;
  }
}