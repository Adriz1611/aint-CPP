import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F)");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.println("Converted Temperature: " + newTemp + " degrees " + unit);

        scanner.close();
    }
}
