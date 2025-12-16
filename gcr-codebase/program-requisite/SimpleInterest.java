import java.util.*;
class SimpleInterest{
    public static double SimpleInterest(double principal, double Rate, double Time){
     return   (principal * Rate * Time) / 100;
}
   public static void main(String [] args){
      Scanner kb=new Scanner(System.in);
      double principal=kb.nextDouble();
      double Rate=kb.nextDouble();
      double Time=kb.nextDouble();
      System.out.println(SimpleInterest(principal,Rate,Time));
      
}
}