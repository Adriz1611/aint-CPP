public class varargs {
    public static void main(String[] args) {
        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        System.out.println("Sum: " + add(1, 2, 3, 4, 15));
        System.out.println("Average: " + average(10, 20, 30, 40, 50));
    }

    static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        return numbers.length > 0 ? sum / numbers.length : 0; // avoid division by zero
    }
}
