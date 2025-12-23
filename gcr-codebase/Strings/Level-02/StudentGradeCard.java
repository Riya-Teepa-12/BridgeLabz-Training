import java.util.Random;

public class StudentGradeCard{

    // Generate random 2-digit PCM scores for n students
    public static int[][] getPCMScores(int students) {

        int[][] scores = new int[students][3];
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(100); 
            scores[i][1] = rand.nextInt(100); 
            scores[i][2] = rand.nextInt(100); 
        }
        return scores;
    }

    //Calculate total, average, and percentage
    public static double[][] calculatingResults(int[][] pcm) {

        double[][] result = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double a = total / 3.0;
            double p = (total / 300.0) * 100;
            a= Math.round(a * 100.0) / 100.0;
            p= Math.round(p * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = a;
            result[i][2] = p;
        }
        return result;
    }

    public static String[][] calculatingGrades(double[][] res) {

        String[][] grades = new String[res.length][1];

        for (int i=0;i<res.length; i++) {

            double percentage = res[i][2];

            if (percentage >= 80)
                grades[i][0] = "A";
            else if (percentage >= 70)
                grades[i][0] = "B";
            else if (percentage >= 60)
                grades[i][0] = "C";
            else if (percentage >= 50)
                grades[i][0] = "D";
            else if (percentage >= 40)
                grades[i][0] = "E";
            else
                grades[i][0] = "R";
        }
        return grades;
    }

    // d) Display scorecard in tabular format
    public static void displayScoreCard(int[][] pcm, double[][] result, String[][] grade) {

        System.out.println("\nStudent\tPhysics\tChem\tMaths\tTotal\tAverage\t%\tGrade");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println((i + 1) + "\t" +
                    pcm[i][0] + "\t" +
                    pcm[i][1] + "\t" +
                    pcm[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade[i][0]);
        }
    }

    public static void main(String[] args) {

        int students = 5; 
        int[][] pcm = getPCMScores(students);
        double[][] results = calculatingResults(pcm);
        String[][] grades = calculatingGrades(results);

        displayScoreCard(pcm, results, grades);
    }
}
