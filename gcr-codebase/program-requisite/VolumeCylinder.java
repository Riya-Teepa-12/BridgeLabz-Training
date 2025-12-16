import java.util.*;
class VolumeCylinder{
    public static double VolumeOfCylinder(double Radius, double height){
     return   Math.PI * Math.pow(Radius,2) * height;
}
   public static void main(String [] args){
      Scanner kb=new Scanner(System.in);
      double Radius=kb.nextDouble();
      double height=kb.nextDouble();
      System.out.println(VolumeOfCylinder(Radius,height));
      
}
}