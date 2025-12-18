import java.util.*;
public class Grade{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input for marks of physics, chemistry, maths and calculate their grade

       System.out.println("Enter marks of physics: ");
        int physics= input.nextInt();
       System.out.println("Enter marks of chemistry: ");
        int chemistry= input.nextInt();
       System.out.println("Enter marks of maths: ");
        int maths= input.nextInt();
       // calculating total percentage
       double percentage=(physics+chemistry+maths)/3;

       //Finding Grade as per the marks given 
       if(percentage<=39)
         System.out.println("Grade: R\n"+"Average marks: "+percentage+"\nRemarks: Remedial standards");
	else if(percentage>=40 && percentage<=49)
          System.out.println("Grade: E\n"+"Average marks: "+percentage+"\nRemarks: Level 1-, too below agency-normalized standards");
       	 else if(percentage>=50 && percentage<=59)
           System.out.println("Grade: D\n"+"Average marks: "+percentage+"\nRemarks: Level 1-, well below agency-normalized standards");
	  else if(percentage>=60 && percentage<=69)
            System.out.println("Grade: C\n"+"Average marks: "+percentage+"\nRemarks: Level 2-, but approaching agency-normalized standards");
 	   else if(percentage>=70 && percentage<=79)
             System.out.println("Grade: B\n"+"Average marks: "+percentage+"\nRemarks: Level 3-,at agency-normalized standards");
	    else if(percentage>=80)
              System.out.println("Grade: A\n"+"Average marks: "+percentage+"\nRemarks: Level 4-,above agency-normalized standards");


	 input.close();
  }
}

