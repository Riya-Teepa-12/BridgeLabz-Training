import java.util.*;
public class AreaOfTriangle{
  public static void main(String []args){
   	Scanner kb=new Scanner(System.in);
       // Taking height and base from the user as input
        double height= kb.nextDouble();
        double base= kb.nextDouble();
      
      //calculating area of triangle in cm, feet , inches
        double areaTriangleInCm = 0.5 * height * base;
        double areaTriangleInInInches = areaTriangleInCm/2.54;
        double areaTriangleInFeet =  areaTriangleInInInches/12;
     
     //Displaying area of a triangle in square inches and square centimeters 
        System.out.println("Your Area in cm is"+ areaTriangleInCm +"while in feet is"+areaTriangleInFeet +"and inches is"+ areaTriangleInInInches);
   } 
}