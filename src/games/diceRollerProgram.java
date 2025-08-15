package games;

import java.util.Random;
import java.util.Scanner;

public class diceRollerProgram {
    public static void main(String[] args) {
        // JAVA DICE ROLLER PROGRAM

        // DECLARE VARIABLES
        // GET # OF DICE FROM THE USER
        // CHECK IF # OF DICE > 0
        // ROLL ALL THE DICE
        // GET THE TOTAL
        // DISPLAY ASCII OF DICE

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.println("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            // Roll all the dice and calculate the total
            for (int i = 1; i <= numOfDice; i++) {
                int roll = random.nextInt(6) + 1; // Rolls a dice (1-6)
                total += roll;
                System.out.println("Roll " + i + ": " + roll);
                printDice(roll);  // Print dice face in ASCII
            }

            System.out.println("Total of all rolls: " + total);
        } else {
            System.out.println("# of dice must be greater than 0");
        }

        scanner.close();
    }

    // Function to display the dice face in ASCII based on the roll
    static void printDice(int roll) {
        switch (roll) {
            case 1:
                System.out.println(" ----- ");
                System.out.println("|     |");
                System.out.println("|  *  |");
                System.out.println("|     |");
                System.out.println(" ----- ");
                break;
            case 2:
                System.out.println(" ----- ");
                System.out.println("|*    |");
                System.out.println("|     |");
                System.out.println("|    *|");
                System.out.println(" ----- ");
                break;
            case 3:
                System.out.println(" ----- ");
                System.out.println("|*    |");
                System.out.println("|  *  |");
                System.out.println("|    *|");
                System.out.println(" ----- ");
                break;
            case 4:
                System.out.println(" ----- ");
                System.out.println("|*   *|");
                System.out.println("|     |");
                System.out.println("|*   *|");
                System.out.println(" ----- ");
                break;
            case 5:
                System.out.println(" ----- ");
                System.out.println("|*   *|");
                System.out.println("|  *  |");
                System.out.println("|*   *|");
                System.out.println(" ----- ");
                break;
            case 6:
                System.out.println(" ----- ");
                System.out.println("|*   *|");
                System.out.println("|*   *|");
                System.out.println("|*   *|");
                System.out.println(" ----- ");
                break;
        }
    }
}
