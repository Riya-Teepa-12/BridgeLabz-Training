import java.util.*;
class CalculateStudentGrade{
  public static void main(String []args){
        Scanner input= new Scanner(System.in);
          
        //taking input from the user
        System.out.println("Enter the number of students");
        int number= input.nextInt();
         

        //declaring array to store marks, percentage, and grade of the students
         int physics[]=new int[number];
         int chemistry[]=new int[number];
         int maths[]=new int[number];
          double percentage[]=new double[number];
          char grade[]=new char[number];

         
         
          for(int i=0;i<number;i++){
           System.out.println("Enter marks for Students"+(i+1));
           System.out.println("Enter Marks of Physics : ");
           physics[i] = input.nextInt();
            if (physics[i] < 0) {
                System.out.println("Marks cannot be negative,  Re-enter your marks");
                i--;
                continue;
            }
            System.out.println("Enter Marks of chemistry : ");
              chemistry[i] = input.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Marks cannot be negative,  Re-enter your marks");
                i--;
                continue;
            }
            System.out.println("Enter Marks of maths : ");
             maths[i] = input.nextInt();
            if (maths[i] < 0) {
                System.out.println("Marks cannot be negative,  Re-enter your marks");
                i--;
                continue;
            }

            //calculationg the percentage
            percentage[i]= (physics[i] + chemistry[i] + maths[i]) / 3.0;

           //calculating grade of students
            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
          
 
          }

          //displaying the marks, percentage, and grade of students
          for(int i=0;i<number;i++){
              System.out.println("Student " + (i + 1));
                System.out.println("Physics: " + physics[i]);
                 System.out.println("Chemistry: " + chemistry[i]);
                 System.out.println("Maths: " + maths[i]);
                 System.out.println("Percentage: " + percentage[i] + "%");
                   System.out.println("Grade: " + grade[i]);
                    System.out.println("--------");
           }

            input.close();
    }
}