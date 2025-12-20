import java.util.*;

public class BMICalculatorForTeamsIn2d{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	//taking integer input as number of person in team

	System.out.println("Enter number of person in team: ");
	int person=input.nextInt();

	double [][]personData=new double[person][3];
	String []BMIStatusArray=new String[person];

	// Calculating BMI and BMI Status for individual person
	for(int i=0;i<person;i++){
            
            System.out.print("Enter weight in kg ans enter positive value only:  ");
            double weight= input.nextDouble();
            System.out.print("Enter height  in centimeters and enter positive value only: ");
            double height= input.nextDouble();
	    personData[i][0]=weight;
	    personData[i][1]=height;
	    height/=100;

            double bmi= weight/(height*height);

	    
	    personData[i][2]=bmi;
	    if(bmi<=18.4)
              BMIStatusArray[i]="Status: Underweight";
             else if(bmi>=18.5 && bmi<=24.9)
               BMIStatusArray[i]="Status: Normal weight";
              else if(bmi>=25 && bmi<=39.9)
                BMIStatusArray[i]="Status: Overweight";
               else if(bmi>=40)
                 BMIStatusArray[i]="Status: Obese";
	}

	//Printing weight, height, BMI, and BMI Status
	for(int i=0;i<person;i++){
		System.out.println("Weight: "+personData[i][0]+" Height: "+personData[i][1]+" BMI: "+personData[i][2]+" "+BMIStatusArray[i]);
	}

        input.close();
    }
}