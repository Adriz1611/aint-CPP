package oop.basicclasses;


import java.util.Random;
import java.util.Scanner;

public class OOPS {
    public static void main(String[] args) {

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car = new Car();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        car.stop();
        car.start();
    }
}
