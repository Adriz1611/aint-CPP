import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        // nextLine reads spaces while next doesn't
        // Don't use a nextline scanner after an int scanner
        // wihtout cleaning the buffer as it can lead to problems.

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Are you a student : ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("What is your GPA : ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your GPA is " + gpa);
        if (isStudent) {
            System.out.println("You are enrolled as a student!!");
        } else {
            System.out.println("You are not yet enrolled!");
        }
        scanner.close();
    }
}
