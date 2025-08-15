package arrays;

public class twoDArrays {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        // Example 1: Groceries (Strings)
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        System.out.println("Groceries:");
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 2: Integer Matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Integer Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 3: Jagged Array (Different row lengths)
        int[][] jaggedArray = {
                {1, 2},
                {3, 4, 5},
                {6}
        };

        System.out.println("Jagged Array:");
        for (int[] row : jaggedArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Example 4: Char 2D Array (like a grid or tic-tac-toe board)
        char[][] board = {
                {'X', 'O', 'X'},
                {' ', 'X', 'O'},
                {'O', ' ', 'X'}
        };

        System.out.println("Tic-Tac-Toe Board:");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
