import java.util.Scanner;
class Number2 {
  public static void main(String[] args) {
    double radius, area;
    Scanner in = new Scanner(System.in);
    System.out.println("Input Circle Radius");
    radius =in.nextDouble();
    area = Product(radius);
    System.out.println("The area of the circle is: " +area);
  }
  public static double Product(double radius){
    double c;
    c = (3.14159*(radius*radius));
    return c;
  }
}