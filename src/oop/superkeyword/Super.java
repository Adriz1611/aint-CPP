package oop.superkeyword;

public class Super {
    public static void main(String[] args) {
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

//        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Tom", "Riddle", 4.5);
        Employee employee = new Employee("Harry", "Porter", 50000);

        student.showGPA();
        employee.showSalary();

    }


}
