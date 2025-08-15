package controlflow;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        int age = 0;
        String name;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("What is your age ?");
        age = scanner.nextInt();

        System.out.println("Are you a student ? (True/False)");
        isStudent = scanner.nextBoolean();

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!!");
        } else {
            System.out.println("Hello " + name);
        }

        if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age == 0) {
            System.out.println("You are a newborn!");
        } else if (age <= 2) {
            System.out.println("You are a toddler!");
        } else if (age <= 12) {
            System.out.println("You are a child!");
        } else if (age <= 17) {
            System.out.println("You are a teenager!");
        } else if (age <= 64) {
            System.out.println("You are an adult!");
        } else if (age <= 130) {
            System.out.println("You are a senior!");
        } else {
            System.out.println("That's an unusually high age—are you from the future?");
        }

        if (isStudent) {
            System.out.println("You are a student!!");
        } else {
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}
