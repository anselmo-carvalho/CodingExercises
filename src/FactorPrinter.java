// FactorPrinter class to print factors of given numbers
public class FactorPrinter {

    // Main method to test the printFactors method
    public static void main(String[] args) {

        // Test cases for the printFactors method
        printFactors(21);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    /**
     * Method to print factors of a given number
     * @param number The integer to find factors for
     */
    public static void printFactors(int number) {
        // Print the initial message
        System.out.print("Factors of " + number + ": ");
        // Check if the number is less than 1, indicating an invalid value
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        // Initialize factor and iterator variable
        int i = 1;
        // Loop through all numbers from 1 to the given number
        while (i <= number) {
            // Check if the current iterator value is a factor of the given number
            if ((number % i) == 0) {
                // Print the factor followed by a space
                System.out.print(i + " ");
            }
            // Increment the iterator
            i++;
        }
        // Print a newline character for formatting
        System.out.println(" ");
    }
}
