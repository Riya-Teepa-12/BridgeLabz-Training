import java.util.*;
class PerimeterRectangle{
public static double perimeterOfaRectangle(double length, double width){
return 2*(length + width);
} 
public static void main(String [] args){
   Scanner kb=new Scanner(System.in);
   double length=kb.nextDouble();
   double width=kb.nextDouble();
   System.out.println(perimeterOfaRectangle(length, width));

}
}