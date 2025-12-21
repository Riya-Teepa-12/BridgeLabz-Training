import java.util.*;
public class EuclideanDistance{


   //Calculating euclidean distance
   public static double euclideanDistance(int x1, int x2, int y1, int y2){
	return Math.sqrt(Math.pow((x2-x1),2))+Math.sqrt(Math.pow((y2-y1),2));
   }

   //Calculating equation of line
   public static double[] equationOfLine(int x1, int x2, int y1,int y2){
	double m=(y2-y1)/(x2-x1);
	double b=y1-(m*x1);

	return new double[]{m,b};
   }

   public static void main(String []args){
	Scanner input=new Scanner(System.in);
	//Taking integer as input for two points
	System.out.println("Enter 2 points: ");

	int x1=input.nextInt();
	int x2=input.nextInt();
	int y1=input.nextInt();
	int y2=input.nextInt();

	double distance=euclideanDistance(x1,x2,y1,y2);
	double []line=equationOfLine(x1,x2,y1,y2);
	
	System.out.println("Euclidean Distance: "+distance);
	System.out.println("Equation of line: y= "+line[0]+"x + "+line[1]);

	input.close();
	
   }

   
}