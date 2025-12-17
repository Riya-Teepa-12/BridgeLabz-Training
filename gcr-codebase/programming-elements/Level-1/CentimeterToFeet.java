import java.util.*;
class CentimeterToFeet{
   public static void main(String []args){
    Scanner kb=new Scanner(System.in);
    //creating a variable which take height in centimeter and taking input from the user
    double heightCm;
    heightCm=kb.nextDouble();
    
   //Converting height in feet and inches
   double heightInches=heightCm/2.54;
   double heightFeet=heightInches/12;

    
   //displaying height in feet and inches 
   System.out.println("Your Height in cm is" + heightCm + "while in feet is" + heightFeet + "and inches is" + heightInches );
    
  }
}