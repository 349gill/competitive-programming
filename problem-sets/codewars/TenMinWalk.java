// https://www.codewars.com/kata/54da539698b8a2ad76000228
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length!=10){
      return false;
    }
    int n=0,s=0,e=0,w=0;
    for (char element: walk){
      if (element=='n'){
        n++;
      }
      else if (element=='s'){
        s++;
      }
      else if (element=='e'){
        e++;
      }
      else{
        w++;
      }
    }
    if (n==s && e==w){
      return true;
    }
    return false;
  }
}