import java.util.*;
class MultiplicationTable{
    public static void main(String []args){
      // creating object of scanner for taking input from user
       Scanner input=new Scanner(System.in);
      //taking integer as input from the user
       int number=input.nextInt();
      
     //using for loop for printing table
       for(int i=6;i<=9;i++){
         System.out.println(number+" "+"*"+" " +i+" " + "=" + " " +number*i);
      }
      input.close();
    }
}