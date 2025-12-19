// class TwoDimentionalArray is used to convert the matrix into 1D array
import java.util.*;
class TwoDimentionalArray{
  public static void main(String [] args){
     //creating object of scanner for taking input from user
      Scanner input= new Scanner(System.in);


     //taking user input for rows and column
      System.out.println("Enter the no of rows: ");
      int rows = input.nextInt();
      System.out.println("Enter the no of columns: ");
      int column = input.nextInt();

     //creating a 2d array and taking input from the user
      int [][]arr =new int[rows][column];
     
      //taking input from the user
       for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                 arr[i][j]=input.nextInt();
              }
           }
      int index=0;
      int[] array = new int[rows * column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                 array[index++]=arr[i][j];
              }
           }
          
       //displaying one-Dimentional array
        System.out.println("Displaying one-Dimentional array");
        for(int i=0;i<array.length;i++){        
           System.out.println(array[i]);

       }
  
      input.close();
    
   }
}