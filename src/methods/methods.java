package methods;

public class methods {

    public static void main(String[] args) {
        // A method = A block of reusable code that is executed when called

        String name = "Bro";
        int age = 25;

        // Check age eligibility
        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+!");
        }

        // Call birthday greeting method
        happyBirthday(name, age);

        // Print square and cube of a number
        System.out.println("Square of 3.0: " + square(3.0));
        System.out.println("Cube of 3.0: " + cube(3.0));

        // Get full name
        String fullName = getFullName("Adrij", "Bhadra");
        System.out.println("Full Name: " + fullName);
    }

    // Method to print birthday greeting
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear " + name + "!");
        System.out.println("You are " + age + " years old!");
        System.out.println("Happy Birthday to you!\n");
    }

    // Method to calculate square
    static double square(double number) {
        return number * number;
    }

    // Method to calculate cube
    static double cube(double number) {
        return number * number * number;
    }

    // Method to concatenate full name
    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    // Method to check if age is 18 or above
    static boolean ageCheck(int age) {
        return age >= 18;
    }
}
