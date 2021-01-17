class Number16 {
  public static void main(String[] args) {
    int a = 6;
    if (a >= 1 && a <= 12){
      String month = Months(a);
      System.out.println(month);
    }else{
      System.out.println("Invalid. Please enter a valid input.");
    }
  }
  public static String Months(int a){
    String Month[] = {" ","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    return Month[a];

 }
}