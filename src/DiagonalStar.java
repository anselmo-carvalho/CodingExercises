public class DiagonalStar {
    public static void main(String[] args) {

        // Print square stars with size 5 and 8
        printSquareStar(5);
        System.out.println();
        printSquareStar(8);
    }
    public static void printSquareStar(int number) {
        // Check if the input number is valid, it should be greater than or equal to 5
        if (number < 5) System.out.println("Invalid Value");
        else {
            // Iterate through each row of the square
            for (int row = 1; row <= number; row++) {
                // Iterate through each column of the square
                for (int col = 1; col <= number; col++) {
                    // Print a star if the current position meets any of the following conditions:
                    // 1. First or last column: col == 1 || col == number
                    // 2. First or last row: row == 1 || row == number
                    // 3. Diagonal from top-left to bottom-right:  row == col
                    // 4. Diagonal from top-right to bottom-left: col == (number - row + 1)
                    if (col == 1 || col == number || row == 1 || row == number || row == col || col == (number - row + 1))
                        System.out.print("*");
                    else System.out.print(" ");
                }
                // Move to the next line after printing all columns in the current row
                System.out.println("");
            }
        }
    }
}
