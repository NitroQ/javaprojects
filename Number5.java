import java.util.Scanner;
public class Number5 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int m, d, y;
      System.out.println("Enter Month (MM) :");
      m = in.nextInt();
      System.out.println("Enter Day (DD) :");
      d = in.nextInt();
      System.out.println("Enter Year (YYYY) :");
      y = in.nextInt();
      year(y, m, d);
   }
   public static void year(int a, int b, int c){
      if (a == 2020){
         System.out.print("This year ");
        if (b > 11){
           System.out.println("in a later month");
        }else  if (b == 11){
           System.out.println("and this month in the " + c + " th");
        } else if (b < 11){
           System.out.println("in an earlier month");
        }
      }else {
        System.out.println("Not This Year");
        System.exit(0);
      }
   }

}