public class searchAnArray {
    public static void main(String[] args) {
        // Example 1: Search in integer array
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 2;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                found = true;
                break; // Stop after finding the first match
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        // Example 2: Search in string array
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        String searchName = "Charlie";
        boolean nameFound = false;

        for (int i = 0; i < names.length; i++) {
            if (searchName.equals(names[i])) { // Use .equals() for string comparison
                System.out.println("Name found at index: " + i);
                nameFound = true;
                break;
            }
        }

        if (!nameFound) {
            System.out.println("Name not found in the array.");
        }
    }
}
