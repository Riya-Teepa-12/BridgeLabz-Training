import java.util.*;
public class ScoreCard{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input for marks of physics, chemistry, maths and calculate their grade

       System.out.println("Enter number of students: ");
        int student= input.nextInt();	

       int marks[][]=marks(student);
       int scorecard[][]=scorecard(student,marks);
       display(student, marks, scorecard);

      
	 input.close();
  }
  
  //Calculating Random marks
  public static int[][] marks(int student){
      
       int [][]marks=new int[student][3];
       for(int i=0;i<student;i++){
	   int physics=(int)(Math.random()*100);
	   int chemistry=(int)(Math.random()*100); 
	   int maths=(int)(Math.random()*100);
	   
	   marks[i][0]=physics;
	   marks[i][1]=chemistry;
	   marks[i][2]=maths;
       }
      return marks;
  }

  //Calculating overall Scorecard
  public static int[][] scorecard(int student, int[][] marks){
	
       int scorecard[][]=new int[student][3];
       for(int i=0;i<student;i++){
	  int total=marks[i][0]+marks[i][1]+marks[i][2];
	  double average=(marks[i][0]+marks[i][1]+marks[i][2])/3;
	  double percentage=(marks[i][0]+marks[i][1]+marks[i][2])/3;

          scorecard[i][0]=total;
	  scorecard[i][1]=(int)Math.round(average);
	  scorecard[i][2]=(int)Math.round(percentage);
       }

       return scorecard; 
  }
  //Display the result
  public static void display(int student, int[][]marks, int[][]scorecard){

       for(int i=0;i<student;i++){
	   System.out.println("S.No:\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
	   System.out.println((i+1)+"\t"+marks[i][0]+"\t"+marks[i][1]+"\t\t"+marks[i][2]+"\t"+scorecard[i][0]+"\t"+scorecard[i][1]+"\t"+scorecard[i][2]);
       }
  }


}

