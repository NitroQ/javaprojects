import java.util.Scanner;

class Area
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	double area, length, width;

	System.out.print("Input Length: ");
	length = in.nextDouble();
	System.out.print("Input Width: ");
	width = in.nextDouble();
	area = length * width;
	System.out.print("Area =  " + area);
	
	}
}