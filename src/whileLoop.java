import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // while loop = repeat some code forever until condition is met

        Scanner scanner = new Scanner(System.in);
        String name = "";

//        if (name.isEmpty()) {
//            System.out.println("Enter your name : ");
//            name = scanner.nextLine();
//        }
        while (name.isEmpty()) {
            System.out.println("Enter your name : ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
    }
}
