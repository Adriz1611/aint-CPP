package games;

import java.util.Random;
import java.util.Scanner;

public class numberGuessinggame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomnumber = random.nextInt(1, 11); // Range: 1 to 10

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 and 10:");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomnumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomnumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != randomnumber);

        scanner.close();
    }
}
