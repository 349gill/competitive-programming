// https://www.codewars.com/kata/5813d19765d81c592200001a
public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
    int total = 0;
    String str = "";
    for (int i=start;i<=end;i++)
    {
      str = String.valueOf(i);
      if (str.indexOf('5')==-1)
      {
        total++;
      }
    }
    return total;
  }
}