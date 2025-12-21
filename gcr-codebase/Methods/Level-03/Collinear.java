import java.util.*;
public class Collinear{


    //Checking  Slope 
   public static void slope(int x1, int y1, int x2, int y2, int x3, int y3){

	int AB=(y2-y1)/(x2-x1);
	int BC=(y3-y2)/(x3-x2);
	int AC=(y3-y1)/(x3-x1);

	if(AB==BC && BC==AC)
	  System.out.println("Points are Collinear,using Slope formula");
	 else
	   System.out.println("Points are not Collinear,using Slope formula");
   }

   //Checking using the area of triangle
   public static void areaOfTriangle(int x1, int y1, int x2, int y2, int x3, int y3){

	int a=x1-x2;
	int b=x2-x3;
	int c=y1-y2;
	int d=y2-y3;

	double area=(0.5)*((a*c)-(c*d));
	if(area==0)
	  System.out.println("Points are Collinear (using area of triangle) ");
	 else
	   System.out.println("Points are not Collinear (using area of triangle)");

   }

   public static void main(String []args){
	Scanner input= new Scanner(System.in);
	//Taking integer as input for three points

	System.out.println("Enter x1");
	int x1=input.nextInt();

	System.out.println("Enter y1");
	int y1=input.nextInt();

	System.out.println("Enter x2");
	int x2=input.nextInt();

	System.out.println("Enter y2");
	int y2=input.nextInt();

	System.out.println("Enter x3");
	int x3=input.nextInt();

	System.out.println("Enter y3");
	int y3=input.nextInt();

	slope(x1,y1,x2,y2,x3,y3);
	areaOfTriangle(x1,y1,x2,y2,x3,y3);

	input.close();
   }

  
}


