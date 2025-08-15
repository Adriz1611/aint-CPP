package applications;

import java.util.Scanner;

public class shoppingCart {

    public static void main(String[] args) {
        // Use try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("What item would you like to buy?: ");
            String item = scanner.nextLine();

            System.out.print("What is the price for each?: ");
            // It's safer to read the line and then parse it to avoid scanner issues
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("How many would you like?: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            double total = price * quantity;
            final char CURRENCY = '$'; // Use a constant for the currency symbol

            System.out.println("\n--- Receipt ---");
            // Use printf for formatted output, especially for currency
            System.out.printf("Item: %s%n", item);
            System.out.printf("Quantity: %d%n", quantity);
            System.out.printf("Total: %c%.2f%n", CURRENCY, total);
        } catch (NumberFormatException e) {
            // Handle cases where the user enters non-numeric input for price or quantity
            System.out.println("Invalid input. Please enter a valid number for price and quantity.");
        }
    }
}