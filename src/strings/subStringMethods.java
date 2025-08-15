import java.util.Scanner;

package strings;

public class subStringMethods {
    public static void main(String[] args) {
        String email;
        String domain;
        String username;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email : ");
        email = scanner.nextLine();
        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(email);
            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Email must contain @");
        }

    }
}
