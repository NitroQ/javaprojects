class Number19 {
  public static void main(String[] args) {
  int num = 30;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag)
      System.out.println("Prime number.");
    else
      System.out.println("Not a Prime number.");
  }
}