import java.util.*;

public class BMICalculator{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	//taking integer input as number for weight and height

	double [][]BMI=new double[10][3];
	String []status=status(BMI);


	for(int i=0;i<10;i++){
	    System.out.println("Enter weight in kg: "+(i+1));
            double weight= input.nextDouble();
            System.out.println("Enter height for in centimeters: "+(i+1));
            double height= input.nextDouble();
	    double bmi=BMI(weight,height);	
	
	    BMI[i][0]=weight;
	    BMI[i][1]=height;
	    BMI[i][2]=bmi;
	}
	
	display(BMI,status);

	input.close();
   }
   
   //Calculating BMI
   public static double BMI(double weight, double height){
	height/=100;
        double bmi= weight/(height*height);

	return bmi;
   }

   //Calculating BMI status
   public static String[] status(double [][]BMI){
	
	String []status=new String[10];
	for(int i=0;i<10;i++){
	    if(BMI[i][2]<=18.4)
	      status[i]="Underweight";
	     else if(BMI[i][2]>=18.5 && BMI[i][2]<=24.9)
	       status[i]="Normal weight";
	      else if(BMI[i][2]>=25 && BMI[i][2]<=39.9)
                status[i]="Overweight";
               else if(BMI[i][2]>=40)
                 status[i]="Obese";
	}
	return status;
   }

   //Display the BMI status
   public static void display(double[][]bmi, String []status){
	System.out.println("S.No:\tWeight\tHeight\tBMI\tStatus");
	for(int i=0;i<10;i++){
	    System.out.println((i+1)+"\t"+bmi[i][0]+"\t"+bmi[i][1]+"\t"+bmi[i][2]+"\t"+status[i]);
	}
   }
}
