package oop.inheritance;


public class inheritance {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        plant.Photosynthesize();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.speak();
        cat.speak();
    }
}
