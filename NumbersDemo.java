public class NumbersDemo{

public static void main(String[] args){
	int x = 10, y = 20;
  System.out.println("For Value X:");
	displayTwiceTheNumber(x);
	displayNumberPlusFive(x);
	displayNumberSquared(x);
	
	System.out.println("For Value Y:");
  displayTwiceTheNumber(y);
	displayNumberPlusFive(y);
	displayNumberSquared(y);
	}

public static void displayTwiceTheNumber(int x){
	System.out.println(x*2);
	}
public static void displayNumberPlusFive(int x){
	System.out.println(x+5);
	}
public static void displayNumberSquared(int x){
	System.out.println(x*x);
	}


}