import java.util.Scanner;
class Number1 {
  public static void main(String[] args) {
    int a, b, c;
    Scanner in = new Scanner(System.in);
    System.out.println("Input Two Integer Numbers: ");
    a=in.nextInt();
    b=in.nextInt();
    Product(a, b);
  }
  public static void Product(int a, int b){
    int c;
    c = a*b;
    System.out.println("The product of the two numbers: "+ c);
  }
}