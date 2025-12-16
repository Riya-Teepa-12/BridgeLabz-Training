import java.util.*;
class PowerCalculate{
public static double PowerOfNumber(double base, double exponent){
return Math.pow(base, exponent);
} 
public static void main(String [] args){
   Scanner kb=new Scanner(System.in);
   double base=kb.nextDouble();
   double exponent=kb.nextDouble();
   System.out.println(PowerOfNumber(base, exponent));

}
}