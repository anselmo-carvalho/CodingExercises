public class FirstLastDigitSum {

    public static void main(String[] args) {

        // Print the sum of first and last digits of the number 252
        System.out.println("Number 252 have a sum of first and last digits = " +
                sumFirstAndLastDigit(-10) );
    }
    /**
     * Calculate the sum of the first and last digits of a given number.
     * If the number is negative, return -1.
     *
     * @param number The number to process.
     * @return The sum of the first and last digits, or -1 if the number is negative.
     */
    public static int sumFirstAndLastDigit(int number) {

        // If the number is negative, return -1
        if (number < 0) {
            return -1;
        }
        int reverse = 0;
        int firstDigit = 0;
        int lastDigit;
        int sequence;
        // Find the last digit of the number
        lastDigit = number % 10;
        // Reverse the number to find the first digit
        while(number != 0) {
            // Store the current number for later use
            firstDigit = number;
            sequence = number % 10;
            reverse = reverse * 10;
            reverse += sequence;
            number /= 10;
        }
        // Return the sum of the first and last digits
        return (firstDigit + lastDigit);
    }
}
