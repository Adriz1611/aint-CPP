package oop.constructors;

package oop.constructors;

public class Constructors {
    public static void main(String[] args) {

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Student student1 = new Student("Adrij", 30, 4.7);
        Student student2 = new Student("Priyanka", 21, 8.9);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);

        student2.study();


    }
}
