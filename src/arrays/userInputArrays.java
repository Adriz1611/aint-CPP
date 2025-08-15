package arrays;

import java.util.Scanner;

public class userInputArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What number of food do you want? : ");
        size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("\nYou entered:");
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
