import java.util.Scanner;
class Pay {
  public static double InsDeductions(double slp){
    double deductions = 0;
    Scanner oc = new Scanner(System.in);
    System.out.println("\n Insurance Options \n 1 for Medical \n 2 for Dental \n 3 for Long-Term Disability \n 0 for finish ");
    for (int i = 1; i <= 3; i++){
     System.out.print("\n Input Option: ");
      int input = oc.nextInt();
      if (input == 0){
        break;
      }else if (input == 1){
        deductions += 32.50;
      }else if (input == 2){
        deductions += 20.00;
      }else if (input == 3){
        deductions += 10.00;
      }
    }
    return deductions;
  }
  public static void main(String[] args) {
    int Skill, Hours, Ret=0;
    double iPay = 0.0, overT = 0.0, slp= 0.0, deductions = 0.0, gPay, nPay;
    Scanner in = new Scanner(System.in);
    System.out.print("Input Skill Level (1/2/3): ");
    Skill = in.nextInt();
    System.out.print("Input Hours Worked: ");
    Hours = in.nextInt();

    if (Skill == 1){
       slp += 17.00;
    }else if (Skill == 2){
        slp += 20.00;
        deductions += InsDeductions(slp);
    }else if (Skill == 3){
       slp += 22.00;
       deductions += InsDeductions(slp); 
       System.out.print("\n Do you have a retirement plan?\n 1 for Yes \n 2 for No \n Input Option: ");
       Ret += in.nextInt();
       
    }
        iPay = (slp*40);
       if (Hours > 40){
        overT = (slp*1.5)*(Hours-40);
         } gPay = iPay + overT;
       if(Ret==1){
          deductions += (gPay*0.03);
        } nPay = gPay - deductions;
         System.out.println("\nSalary Overview\nHours Worked: "+ Hours);
         System.out.println("Hourly Pay Rate: " + slp);
         System.out.println("Regular Pay: " + iPay);
         System.out.println("Overtime Pay: " + overT);
         System.out.println("Gross Pay: " + gPay);
    if (deductions > gPay) {
				System.out.println("Error: deductions exceeds total pay.");
			} else {
				System.out.println("Deductions: " + deductions);
				System.out.println("Net pay: " + nPay);
    }
    
   
  }
} 
