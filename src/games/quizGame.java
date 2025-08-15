import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
        // JAVA QUIZ GAME 🎮
        // QUESTIONS array[]
        // OPTIONS array[][]
        // DECLARE VARIABLES
        // WELCOME MESSAGE
        // QUESTION (loop)
        // OPTIONS
        // GET GUESS FROM USER
        // CHECK OUR GUESS
        // DISPLAY FINAL SCORE

        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of the computer?",
                "What was the first high-level programming language?"
        };

        // Options are now prefixed with numbers for clarity
        String[][] options = {
                {"1. To store data", "2. To connect networks", "3. To display images", "4. To print documents"},
                {"1. Hard Drive", "2. RAM", "3. CPU", "4. Monitor"},
                {"1. 2003", "2. 2004", "3. 2005", "4. 2006"},
                {"1. Bill Gates", "2. Steve Jobs", "3. Charles Babbage", "4. Alan Turing"},
                {"1. Java", "2. C++", "3. FORTRAN", "4. Python"}
        };

        // Answers now store the correct integer option (1, 2, 3, or 4)
        int[] answers = {2, 3, 2, 3, 3};

        //--- VARIABLES ---
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        //--- GAME LOGIC ---
        System.out.println("--- Welcome to the Java Quiz Game! ---");

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            // Display the question
            System.out.println("\n----------------------------------------");
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            // Display the options
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Get the user's guess
            System.out.print("Enter your answer (1-4): ");
            int guess = scanner.nextInt();

            // Check if the guess is correct
            if (guess == answers[i]) {
                System.out.println("Correct! 👍");
                score++;
            } else {
                System.out.println("Wrong! 👎 The correct answer was " + answers[i]);
            }
        }

        //--- FINAL SCORE ---
        System.out.println("\n----------------------------------------");
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score + "/" + questions.length);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
