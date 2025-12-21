import java.util.*;
public class YoungestFriends{
    //methods to check the youngest among three friends 
    public static String youngest(int age[]){
	if(age[0]<age[1] && age[0]<age[2])
	  return "Amar";
	 else if(age[1]<age[0] && age[1]<age[2])
	   return "Akbar";
	  else
	    return "Anthony";
   }
   
   //methods to check the tallest among three friends
   public static String tallest(int height[]){
	if(height[0]>height[1] && height[0]>height[2])
	  return "Amar";
	 else if(height[1]>height[0] && height[1]>height[2])
	   return "Akbar";
	  else
	    return "Anthony";
   }

   public static void main(String []args){
	Scanner input=new Scanner(System.in);

	//creating  integer array to take input for age and height

	int []age=new int[3];
	int []height=new int[3];
        String names[]= {"Amar","Akbar","Anthony"};
	for(int i=0;i<3;i++){
	    System.out.println("Enter age : "+names[i]);
	    age[i]=input.nextInt();
	    System.out.println("Enter height: "+names[i]);
	    height[i]=input.nextInt();
	}
	   

       //displaying the result 
	System.out.println("Youngest friend: "+youngest(age));
	System.out.println("Tallest friend: "+tallest(height));
   }
   
  }






