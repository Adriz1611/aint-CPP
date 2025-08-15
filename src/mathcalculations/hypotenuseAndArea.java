package mathcalculations;

import java.util.Scanner;

public class hypotenuseAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A : ");
        a = scanner.nextDouble();

        System.out.println("Enter the length of side B : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse is : " + c);


        double radius;
        double circumference;
        double area;
        double volume;
        System.out.println("Enter the radius : ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference is: " + circumference + "cm");
        System.out.println("The area is: " + area + "cm2");
        System.out.println("The volume is: " + volume + "cm3");

        scanner.close();

    }
}
