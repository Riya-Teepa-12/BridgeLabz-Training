import java.util.Scanner;

public class SchoolBusAttendance{

    public static void main(String[] args) {

      
       //create scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		
		int totalPresent=0;
        //create string array of the student names
        String studentName[] ={"Riya","Yukta","Harshit","Bhoomika","Arya","Khushi","Shradha","Disha","Rashi","Aneek"};
		for(int i=0;i<10;i++){
		   System.out.println(studentName[i]+ " :Present or Absent?");
		   String s=input.nextLine();
		   
		   if(s.equals("Present")){
		     totalPresent++;
		   }
		   
		}

           //displaying the result 
		
		System.out.println("The number of present students "+totalPresent);
		System.out.println("The number of Absent students "+(10-totalPresent));
      

        input.close();
    }
}
