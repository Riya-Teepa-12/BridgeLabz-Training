import java.util.*;
class AreaOfCircle{
    public static double AreaOfCircle(double Radius){
     return   Math.PI * Math.pow(Radius,2);
}
   public static void main(String [] args){
      Scanner kb=new Scanner(System.in);
      double Radius=kb.nextDouble();
      System.out.println(AreaOfCircle(Radius));
      
}
}