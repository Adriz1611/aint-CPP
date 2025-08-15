import java.util.Arrays;

package arrays;

public class arrays {
    public static void main(String[] args) {
        // Arrays in Java are objects,
        // like all other objects in Java,
        // arrays implicitly inherit from the java.lang.Object class.
        // This allows you to invoke methods defined in Object
        // (such as toString(), equals() and hashCode()).

        String[] fruits = {"apple", "orange", "pineapple", "watermelon"};
        int numOfFruits = fruits.length;
        System.out.println(fruits); // prints the address
        System.out.println(Arrays.toString(fruits));
        System.out.println(numOfFruits);

        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        for (String fruit : fruits) { // enhanced for loop
            System.out.println(fruit);
        }
    }
}
