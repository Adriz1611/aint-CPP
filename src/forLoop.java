import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }

        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();
        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year!");

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i + " ");
        }
    }
}
