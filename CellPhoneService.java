import java.util.Scanner;
class CellPhoneService {
  public static void main(String[] args) {
    int talk, text, data;
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Horizon Phones! \n Choose the correct plan for your usage.");
    System.out.println("Input Max Talk Minutes:");
    talk = in.nextInt();
    System.out.println("Input Max Text Messages:");
    text = in.nextInt();
    System.out.println("Input Data Usage (in GB):");
    data = in.nextInt();

    if (talk < 500 && text == 0 && data == 0){
      System.out.println("Choose Plan A for $49 (up to 500mins talk time)");
    }if (talk< 500 && text > 0 && data == 0){
      System.out.println("Choose Plan B for $55 (up to 500mins talk time with messaging)");
    }if(talk >=500 && text <=100 && text > 0 && data == 0){
      System.out.println("Choose Plan C for $61 (up to 100 messages and more than 500min talk time)");
    }if(talk >= 500 && text > 100 && data == 0){
      System.out.println("Choose Plan D for $70 (for more than 100 messages and more than 500min talk time )");
    }if(data < 2 && data > 0){
       System.out.println("Choose Plan E for $79 (up to 2 GB data)");
    }if(data >= 2 && data > 0){
      System.out.println("Choose Plan F for $87 (more than 2 GB data)");
      }

  }
}