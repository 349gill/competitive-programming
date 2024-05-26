public class Century{
    public static String whatCentury(int year) {
      int cen;
      if (year%100==0 && year!=0){
        cen = year/100;
      }
      else{
        if (year==0){
          cen = 1;
        }
        else{
          cen = (year/100)+1;
        }
      }
      
      String cenStr = String.valueOf(cen);
      
      if ((11<=cen && cen<=19) || cen%10==0 || (4<=cen%10 && cen%10<=9)){
        return cenStr.concat("th");
      }
      else if (cen%10==1){
        return cenStr.concat("st");
      }
      else if (cen%10==2){
        return cenStr.concat("nd");
      }
      else{
        return cenStr.concat("rd");
      }
    }
}