class Number11 {
  public static void main(String[] args) {
    WeightedAve();
  }
  public static void WeightedAve(){
     double in1, in2, in3, result;
     in1 = 81.2;
     in2 = 0.75;
     in3 = 3.25;
     result = (((in1*2)+(in2*3)+(in3*5))/10);
     System.out.printf("%.1f",result);

 }
}