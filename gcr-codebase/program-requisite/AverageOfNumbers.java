import java.util.*;
class AverageOfNumbers{
public static double Average(double a, double b, double c){
return (a+b+c)/3;
} 
public static void main(String [] args){
   Scanner kb=new Scanner(System.in);
   double a=kb.nextDouble();
   double b=kb.nextDouble();
   double c=kb.nextDouble();
   System.out.println(Average(a,b,c));

}
}