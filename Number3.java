import java.util.Scanner;
class Number3 {
  public static void main(String[] args) {
    int a, b;
    Scanner in = new Scanner(System.in);
    System.out.println("Input current year: ");
    a = in.nextInt();
    System.out.println("Input birth year: ");
    b = in.nextInt();
    double c = Premiums(a,b);
    System.out.println("Premiums :" + c);

  }
  public static double Premiums(int a, int b){
  int c, d;
  c= a-b;
  d = c/10;
  double e = (d+15)*20;
   return e;
  }
}