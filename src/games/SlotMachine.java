package games;

import java.util.Scanner;

import java.util.Random;

public class SlotMachine {
    private static Scanner scanner = new Scanner(System.in);
    private static int balance = 100;
    private static int bet;
    private static int payout;
    private static String[] row;

    public static void main(String[] args) {
        // Display welcome message
        System.out.println("*************************");
        System.out.println("   Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("*************************");

        // Main game loop
        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            // Validate bet amount
            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                // Subtract bet from balance
                balance -= bet;

                // Spin the slot machine
                row = spinRow();

                // Print the result
                printRow(row);

                // Calculate payout
                payout = getPayout(row, bet);

                if (payout > 0) {
                    System.out.println("You won $" + payout + "!");
                    balance += payout;
                } else {
                    System.out.println("You lost this round. Better luck next time!");
                }

                // Ask to play again
                System.out.print("Do you want to play again? (y/n): ");
                String playAgain = scanner.next();
                if (!playAgain.toLowerCase().equals("y")) {
                    break;
                }
                System.out.println();
            }
        }

        // Display exit message
        if (balance <= 0) {
            System.out.println("*************************");
            System.out.println("   GAME OVER - No funds!  ");
            System.out.println("*************************");
        } else {
            System.out.println("*************************");
            System.out.println("Thanks for playing!");
            System.out.println("Final balance: $" + balance);
            System.out.println("*************************");
        }

        scanner.close();
    }

    // Method to spin the slot machine and generate random symbols
    static String[] spinRow() {
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // Method to print the slot machine result
    static void printRow(String[] row) {
        System.out.println("*****************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*****************");
    }

    // Method to calculate payout based on matching symbols
    static int getPayout(String[] row, int bet) {
        // Check if all three symbols match
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }

        // Check for two matching symbols (smaller payout)
        if (row[0].equals(row[1]) || row[1].equals(row[2]) || row[0].equals(row[2])) {
            String matchingSymbol = "";
            if (row[0].equals(row[1])) {
                matchingSymbol = row[0];
            } else if (row[1].equals(row[2])) {
                matchingSymbol = row[1];
            } else if (row[0].equals(row[2])) {
                matchingSymbol = row[0];
            }

            return switch (matchingSymbol) {
                case "🍒" -> bet * 1;
                case "🍉" -> bet * 1;
                case "🍋" -> bet * 2;
                case "🔔" -> bet * 3;
                case "⭐" -> bet * 5;
                default -> 0;
            };
        }

        return 0; // No matches, no payout
    }
}