import java.util.Scanner;

public class RockPaperScissors{

    // Method to generate computer choice using Math.random()
    public static String getChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Method to find the winner 
    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)){
            return "Draw";
        }
        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate average and percentage
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];
        double Percentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", Percentage);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercentage);

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameResults[i][0] + "\t\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2]);
        }
        System.out.println("\nStatistics:");
        System.out.println("Player\tWins\tWinning %");
        for (int i = 0; i < stats.length; i++){
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = input.nextInt();

        String[][] gameResults = new String[games][3];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = input.next();
            String computerChoice = getChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(gameResults, stats);

        input.close();
    }
}
