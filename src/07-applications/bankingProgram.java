import java.util.Scanner;

public class bankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // JAVA BANKING PROGRAM FOR BEGINNERS
        // DECLARE VARIABLES
        // DISPLAY MENU
        // GET AND PROCESS USERS CHOICE
        // showBalance()
        // deposit()
        // withdraw()
        // EXIT MESSAGE

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = deposit(balance);
                case 3 -> balance = withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("Thank you for using our banking system!");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Your balance is: $%.2f\n", balance);
    }

    static double deposit(double balance) {
        double amount;
        System.out.println("Enter an amount to be deposited:");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative!");
        } else {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f. New balance: $%.2f\n", amount, balance);
        }
        return balance;
    }

    static double withdraw(double balance) {
        double amount;
        System.out.println("Enter an amount to be withdrawn:");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f. New balance: $%.2f\n", amount, balance);
        }
        return balance;
    }
}
