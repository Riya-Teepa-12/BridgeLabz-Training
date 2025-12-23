import java.util.Scanner;

public class BMICalculateStatus{

    // calculate BMI and Status for one person
    public static String[] findBmi(double weight,double heightCm){
        double ht=heightCm/100;
        double bmi=weight/(ht*ht);
        bmi=Math.round(bmi*100.0)/100.0;
        String status;

        if(bmi<=18.4)
            status="Underweight";
        else if(bmi>=18.5&&bmi<=24.9)
            status="Normal";
        else if(bmi>=25.0&&bmi<=39.9)
            status="Overweight";
        else
            status="Obese";

        return new String[]{String.valueOf(bmi),status};
    }

    //2D String array 
    public static String[][] bmiReport(double[][] dt){

        int p=dt.length;
        String[][] result=new String[p][4];

        for(int i=0;i<p;i++){
            double weight=dt[i][0];
            double height=dt[i][1];

            String[] bmiData=findBmi(weight,height);

            result[i][0]=String.valueOf(height);
            result[i][1]=String.valueOf(weight);
            result[i][2]=bmiData[0];
            result[i][3]=bmiData[1];
        }
        return result;
    }

    // generating  BMI report 
    public static void displayReport(String[][] arr){

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for(int i=0;i<arr.length;i++){
            System.out.println(
                arr[i][0]+"\t\t"+
                arr[i][1]+"\t\t"+
                arr[i][2]+"\t"+
                 arr[i][3]
            );
        }
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        // declaring 2D array
        double[][] data=new double[10][2];

        System.out.println("Enter Weight,Height of 10 persons:");

        for(int i=0;i<10;i++){
            System.out.println("Person "+(i+1)+":");
            System.out.print("Weight");
            data[i][0]=input.nextDouble();

            System.out.print("Height");
            data[i][1]=input.nextDouble();
        }

        String[][] rep=bmiReport(data);
        displayReport(rep);

        input.close();
    }
}
