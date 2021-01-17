import java.util.Scanner;
class MetricConversion{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input number to convert to cm and liters: ");
    int a = in.nextInt();
    Centimeters(a);
    Liters(a);
  }
  public static void Centimeters(int a){
  double b;
  b = a*2.54;
  System.out.printf(a + " inches converted to centimeters is: " + b + " cm" + " by multiplying " + a + " inches to 2.54." );
  System.out.println(" ");
	}
  public static void Liters(int a){
  double b;
  b = a*3.7854;
  System.out.printf(a + " gallons converted to liters is: " + b + " L " + " by multiplying " + a + " gallons to 3.7854." );

  } 
  
}