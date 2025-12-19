import java.util.*;
class FriendAgeHeight{
   public static void main(String []args){
        //creating object of scanner for taking input
          Scanner input= new Scanner(System.in);
        
       //taking a number as input from the user
        String []names ={"Amar" , "Akbar" , "Anthony"};

       //declaring arrays to store age and height
         int[] age = new int[3];
        double[] height = new double[3];
       //taking input from the user for age and height
         for(int i=0;i<3;i++){
            System.out.println("Enter all the details of"+ names[i]);
             System.out.print("Enter age: ");
               age[i] = input.nextInt();
              System.out.print("Enter height (in cm): ");
                height[i] = input.nextDouble();
          }
         int youngIndex=0;
         int tallIndex=0;
       //checking the youngest age  and tallest height
             for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngIndex]) {
                youngIndex = i;
            }
            if (height[i] > height[tallIndex]) {
                tallIndex = i;
            }
           }

        //displaying the result 
          System.out.println("Youngest Friend : " + names[youngIndex] +
                           " (Age: " + age[youngIndex] + ")");
        System.out.println("Tallest Friend  : " + names[tallIndex] +
                           " (Height: " + height[tallIndex] + " cm)");

        input.close();
            
         }
}