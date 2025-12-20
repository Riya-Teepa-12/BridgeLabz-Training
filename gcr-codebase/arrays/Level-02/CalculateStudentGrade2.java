import java.util.*;
class CalculateStudentGrade2{
  public static void main(String []args){
        Scanner input= new Scanner(System.in);
          
        //taking input from the user
        System.out.println("Enter the number of students");
        int number= input.nextInt();
         

        //declaring array to store marks, percentage, and grade of the students
          int marks[][] = new int[number][3];
          double percentage[]=new double[number];
          char grade[]=new char[number];

         
         
          for(int i=0;i<number;i++){
              System.out.println("Enter marks for Students"+(i+1));

            for(int j=0;j<3;j++){
        
             if (j == 0)
                    System.out.print("Physics: ");
                else if (j == 1)
                    System.out.print("Chemistry: ");
                else
                    System.out.print("Maths: ");

                marks[i][j] = input.nextInt();
           
           if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Re-enter student details.");
                    i--;   
                    break;
                } 
          }
    }
           //calculating percentage and grade
           for (int i = 0; i < number; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

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
                System.out.println("Physics: " + marks[i][0]);
                 System.out.println("Chemistry: " + marks[i][1]);
                 System.out.println("Maths: " + marks[i][2]);
                 System.out.println("Percentage: " + percentage[i] + "%");
                   System.out.println("Grade: " + grade[i]);
                    System.out.println("--------");
           }

            input.close();
    }
}