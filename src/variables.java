import java.util.Scanner;

public class variables {
    public static void main(String[] args) {

        System.out.println("Ghevar khana hai");
        System.out.print("i like pixxa\n");
        System.out.println("i like pizza, its really good");

        int age = 21;
        int year = 2025;
        int quantity = 1;

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);
        System.out.println("The year is " + year);

        double price = 19.99;
        double price2 = 19;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price);
        System.out.println("$" + price2);
        System.out.println(gpa);
        System.out.println(temperature);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        // boolean isStudent = true;
        boolean isStudent = false;
        boolean isGay = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are a certified Gay!");
        }

        String name = "Adrij";
        System.out.println("Hello " + name);

        Scanner scanner = new Scanner(System.in);

        scanner.close();

    }
}
