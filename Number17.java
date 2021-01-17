class Number17 {
  public static void Determine(int a){
    if (a%2 == 0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
  public static void main(String[] args) {
    int a = 79;
    Determine(a);
  }
}