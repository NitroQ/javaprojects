import java.util.Scanner;

class InchesToFeet2 {
	public static void main (String[] args) {
	int inches,feet,in;

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a desired number");
	inches =sc.nextInt();
	feet=inches/12;
	in=inches%12;

	System.out.print(" the answer is " + feet + " feet " + in + " inches ");
	}
}