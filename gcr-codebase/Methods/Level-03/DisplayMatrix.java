import java.util.*;
public class DisplayMatrix{
   public static void main(String []args){
	Scanner input=new Scanner(System.in);
	//Taking integer as input for row and column

	System.out.println("Enter number of row:");
	int row=input.nextInt();
	System.out.println("Enter number of column:");
	int column=input.nextInt();

	int [][]A=randomMatrix(row,column);
	int [][]B=randomMatrix(row,column);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("Addition (A+B):");
        displayMatrix(addMatrices(A,B));

        System.out.println("Subtraction (A-B):");
        displayMatrix(subtractMatrices(A,B));

        System.out.println("Multiplication (A*B):");
        displayMatrix(multiplyMatrices(A,B));

	input.close();
   }
   
   //Creating Random Matrix
   public static int[][]randomMatrix(int row,int column){
	int [][]matrix=new int[row][column];

	for(int i=0;i<row;i++){
	   for(int j=0;j<column;j++){
		matrix[i][j]=(int)(Math.random()*10);
	   }
	}
	return matrix;
   }
   
   //Addition of Matrix
   public static int[][] addMatrices(int[][]A, int[][] B) {
        int row=A.length;
        int column=A[0].length;
        int[][] result = new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result[i][j]=A[i][j]+B[i][j];
            }
        }
        return result;
    }

   //subtration of Matrix
   public static int[][] subtractMatrices(int[][] A, int[][] B) {
	int row=A.length;
        int column= A[0].length;
        int[][] result= new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result[i][j]= A[i][j]-B[i][j];
            }
        }
        return result;
    }

   //Multiplication of matrix
   public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int row= A.length;
        int column= B[0].length;
        int common=B.length;
        int[][] result= new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                for (int k=0;k<common;k++){
                    result[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return result;
    }

    //Displat All operation on matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row:matrix) {
            for (int value:row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}