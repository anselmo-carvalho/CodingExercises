// This class calculates the Greatest Common Divisor of two numbers
public class GreatestCommonDivisor {

    public static void main(String[] args) {

        // Test cases for the getGreatestCommonDivisor method
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    /**
     * This method calculates the Greatest Common Divisor of two numbers.
     * If either number is less than 10, it returns -1.
     *
     * @param first  The first number
     * @param second The second number
     * @return The Greatest Common Divisor of the two numbers or -1 if either number is less than 10
     */
    public static int getGreatestCommonDivisor(int first, int second) {

        // Return -1 if either number is less than 10
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        // Find the minimum of the two numbers to limit the loop
        int test = Math.min(first, second);

        // Variables to store dividers and the greatest common divisor
        int dividerFirst = 0;
        int dividerSecond = 0;
        int greatestCommonDivisor = 0;

        // Loop through all numbers from 1 to the minimum of the two numbers
        for (int i = 1; i <= test; i++) {
            // Check if the current number divides the first number
            if (first % i == 0) dividerFirst = i;
            // Check if the current number divides the second number
            if (second % i == 0) dividerSecond = i;
            // If the dividers are equal, store the current divider as the greatest common divisor
            if (dividerFirst == dividerSecond) {
                greatestCommonDivisor = dividerFirst;
            }
        }
        // Return the greatest common divisor
        return greatestCommonDivisor;
    }
}
