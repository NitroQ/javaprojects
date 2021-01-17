import java.util.Scanner;
class Number14 {

     public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n1 = 0;
        try {
            n1 += Integer.parseInt(s.nextLine());
        }catch(Exception e) {
            System.out.println(" Invalid. Please enter a valid input.");
            System.exit(0);
        }
       div(n1);
     }
     
     public static void div(int n1) {
         if(n1%7 == 0){
           System.out.println("Divisible");
         }else{
           System.out.println("Not Divisible");
         }
       
     }
}