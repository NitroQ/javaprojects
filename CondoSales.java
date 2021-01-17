import java.util.Scanner;
class CondoSales {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("**Welcome to Summerdale Condo!**");
   
    System.out.println(" 1 for Park View \n 2 for Golf Course View \n 3 for for Lake View");
    System.out.print("Choose your Type of Unit: 1/2/3: ");
    int condo = in.nextInt();
    if (condo == 1){
      System.out.println("Park View: $150,000 ");
    }else if (condo == 2){
      System.out.println("Golf Course View: $170,000 ");
    }else if (condo == 3){
      System.out.println("Lake View: $210,000 ");
    }else{
      System.out.println("Cost: 0");
    }

  }
}