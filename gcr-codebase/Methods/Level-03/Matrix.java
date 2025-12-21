import java.util.*;
class Matrix{
   //method to create a random matrix taking rows and columns as parameters
    public static double[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // values 1 to 10
            }
        }
        return matrix;
    }
	// Method to display a matrix
    public static void showMatrix(double[][] matrix) {
        for (int i=0;i<matrix.length;i++) {
            for (int j=0; j<matrix[0].length;j++) {
                System.out.printf(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
	
    // Method to find transpose
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
	// Determinant of 2x2 matrix
    public static double determinantOf2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }
      
	// Determinant of 3x3 matrix
    public static double determinantOf3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverseOf2x2(double[][] m) {
        double det = determinantOf2x2(m);

        if (det == 0) {
            System.out.println("Inverse not possible (Determinant is 0)");
            return null;
        }

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }
	
	// Inverse of 3x3 matrix
    public static double[][] inverseOf3x3(double[][] m) {
        double det = determinantOf3x3(m);

        if (det == 0) {
            System.out.println("Inverse not possible (Determinant is 0)");
            return null;
        }

        double[][] inverse = new double[3][3];

        inverse[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inverse[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inverse[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inverse[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inverse[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inverse[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inverse[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inverse[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inverse[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inverse;
	}
	
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter matrix size (2,3)");
		 int n=input.nextInt();
	  double[][] matrix2x2 = generateRandomMatrix(n, n);
        System.out.println("2x2 Matrix:");
        showMatrix(matrix2x2);
        System.out.println("Transpose:");
        showMatrix(transpose(matrix2x2));

        System.out.println("Determinant: " + determinantOf2x2(matrix2x2));

        double[][] inv2x2 = inverseOf2x2(matrix2x2);
        if (inv2x2 != null) {
            System.out.println("Inverse:");
            showMatrix(inv2x2);
        }
		
		// 3x3 Matrix
        double[][] matrix3x3 = generateRandomMatrix(3, 3);
        System.out.println("3x3 Matrix:");
        showMatrix(matrix3x3);

        System.out.println("Transpose:");
        showMatrix(transpose(matrix3x3));

        System.out.println("Determinant: " + determinantOf3x3(matrix3x3));

        double[][] inv3x3 = inverseOf3x3(matrix3x3);
        if (inv3x3 != null) {
            System.out.println("Inverse:");
              showMatrix(inv3x3);
        }

	}
 }