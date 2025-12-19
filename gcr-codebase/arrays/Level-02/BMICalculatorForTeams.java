import java.util.*;

public class BMICalculatorForTeams {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	//taking integer input as number of person in team

	System.out.println("Enter number of person in team: ");
	int person=input.nextInt();

	int []weightArray=new int[person];
	int []heightArray=new int[person];
	int []BMIArray=new int[person];
	String []BMIStatusArray=new String[person];

	// Calculating BMI and BMI Status for individual person
	for(int i=0;i<person;i++){
            
            System.out.print("Enter weight for "+(i+1)+" person in kg: ");
            double weight= input.nextDouble();
            System.out.print("Enter height for "+(i+1)+" person in centimeters: ");
            double height= input.nextDouble();
	    weightArray[i]=(int)weight;
	    heightArray[i]=(int)height;
	    height/=100;

            double bmi= weight/(height*height);

	    
	    BMIArray[i]=(int)bmi;
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
		System.out.println("Weight: "+weightArray[i]+" Height: "+heightArray[i]+" BMI: "+BMIArray[i]+" "+BMIStatusArray[i]);
	}

        input.close();
    }
}
