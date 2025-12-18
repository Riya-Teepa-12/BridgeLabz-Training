import java.util.Scanner;
public class OddEven{
    public static void main(String []args){
           //creating object of Scanner and taking numbers as input  from user
          Scanner t=new Scanner(System.in);
           int number=t.nextInt();
            if (number < 0) {
            System.out.println("Please enter a positive integer");
            } else{
          //checking for even odd condition by using for loop
           for(int i=1;i<=number;i++){
             if(i%2==0)
             System.out.println("The number "+" " + i + " "+"is even");
             else 
             System.out.println("The number "+" " + i + " "+"is odd");
            }
         }
            
     }
 }