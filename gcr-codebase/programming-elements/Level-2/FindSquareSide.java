import java.util.*;
class FindSquareSide{
   public static void main(String []args){
     Scanner kb= new Scanner(System.in);

     // taking perimeter as input from the user
      int perimeterOfSquare = kb.nextInt();
      //calculate side of the square 
      int side= perimeterOfSquare/4;
   
     // Displaying the length of the side of square
      System.out.println("The length of the side is" + side + " whose perimeter is" + perimeterOfSquare );
      
  }
}