import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME
        // DECLARE VARIABLES
        // GET CHOICE FROM THE USER
        // GET RANDOM CHOICE FOR THE COMPUTER
        // CHECK WIN CONDITIONS
        // ASK TO PLAY AGAIN?
        // GOODBYE MESSAGE

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice");
                continue; // skip to next loop iteration
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice : " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }

        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
    }
}
