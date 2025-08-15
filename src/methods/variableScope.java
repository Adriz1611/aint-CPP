// This program demonstrates the concept of variable scope in Java

package methods;

public class variableScope {

    // This is a **class-level variable** (also called a global or static variable)
    // It can be accessed by all static methods in this class
    static int x = 3;

    public static void main(String[] args) {

        // This is a **local variable** named 'x', declared inside the main() method
        // It only exists and is accessible within the main() method
        int x = 1;

        // This will print the local 'x' (which is 1), not the class-level 'x' (which is 3)
        // Because local variables **hide** global ones with the same name inside their scope
        System.out.println(x);  // Output: 1

        // Call another method
        doSomething();
    }

    static void doSomething() {

        // This is another **local variable** named 'x', but in a different method
        // It is **completely separate** from the 'x' in main() and from the class-level 'x'
        int x = 2;

        // This will print the local 'x' of doSomething(), which is 2
        System.out.println(x);  // Output: 2
    }
}
