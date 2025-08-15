package strings;

public class stringMethods {
    public static void main(String[] args) {
        String name = "Bro Code";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastindex = name.lastIndexOf("o");

        name = name.toUpperCase();
        name = name.toLowerCase();

        // removes the whitespaces
        name = name.trim();

        name = name.replace("o", "a");

        System.out.println(name);
        // name.equals()
        // name.equalsIgnoreCase()
        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name DOESN'T contain any spaces");
        }

    }
}
