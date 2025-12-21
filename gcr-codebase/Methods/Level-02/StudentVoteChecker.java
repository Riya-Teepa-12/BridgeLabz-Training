import java.util.*;
public class StudentVoteChecker{

   //method to check voter is eligible or not
   public static boolean canStudentVote(int age){
	if(age>=18)
	   return true;
	 else
	    return false;
   }

   public static void main(String []args){
	Scanner input=new Scanner(System.in);
	//Taking integer as input for all 10 students age

	int []array=new int[10];
	for(int i=0;i<10;i++){
	    System.out.println("Enter age of "+(i+1)+" Student");
	    array[i]=input.nextInt();
	}

	//checking student can vote
	for(int i=0;i<10;i++){
	    if(canStudentVote(array[i]))
	       System.out.println("Can Vote");
	     else
	        System.out.println("Cannot Vote");
	}
	
	input.close();
   }
   }
	    

	