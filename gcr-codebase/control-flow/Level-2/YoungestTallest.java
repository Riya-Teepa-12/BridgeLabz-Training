import java.util.*;
public class YoungestTallest{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
      //Taking input from the user for the ages
        System.out.println("Enter Amar Age");
        int age1=input.nextInt();
        System.out.println("Enter Akbar Age");
        int age2=input.nextInt();
        System.out.println("Enter Anthony Age");
        int age3=input.nextInt();

      //Taking input from the user for the heights
         System.out.println("Enter Amar height");
          int height1=input.nextInt();
         System.out.println("Enter Akbar height");
          int height2=input.nextInt();
         System.out.println("Enter Anthony Age");
          int height3=input.nextInt();
       
      //finding youngest friend
        if(age1<=age2 && age1<=age3)
           System.out.println("Amar is the youngest");
          else if(age2<=age1 && age2<=age3)
             System.out.println("Akbar is the youngest");
             else if(age3<=age2 && age3<=age1)
                 System.out.println("Anthony is the youngest");


       //finding tallest friend
         if(height1>=height2 && height1>=height3)
           System.out.println("Amar is the tallest");
            else if(height2>=height1 && height2>=height3)
              System.out.println("Akbar is the tallest");
                else if(height3>=height2 && height3>=height1)
                    System.out.println("Anthony is the tallest");

        input.close();



    }
}