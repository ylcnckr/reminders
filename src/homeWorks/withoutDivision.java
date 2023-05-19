package homeWorks;

public class withoutDivision {
    public static void main(String[] args) {


        double dividend = 10;
        double divisor = 3;
        double quotient = 0;
  while (dividend>=divisor){
      dividend-=divisor;
      quotient++;
  }
        System.out.println(quotient);
    }
}
