import java.util.Scanner;
public class UserInfo 
{
	public static void main(String[] args)
	{
	String name;
	int age;
	Scanner inputDevice = new Scanner(System.in);
	System.out.println("Please Enter your Name: ");
	name = inputDevice.nextLine();
	System.out.print("Please Enter your Age: ");
	age = inputDevice.nextInt();
	System.out.println("Your name is " + name + " and you are " + age + " years old.");
	
	}
}
	