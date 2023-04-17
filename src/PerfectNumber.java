// The PerfectNumber class checks if a given number is a perfect number
public class PerfectNumber {

    // The main method tests the isPerfectNumber method with some sample numbers
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    /**
     * The isPerfectNumber method checks if a given integer is a perfect number.
     * A perfect number is a positive integer that is equal to the sum of its proper divisors.
     * @param number the integer to check
     * @return true if the integer is a perfect number, false otherwise
     */
    public static boolean isPerfectNumber(int number) {

        // Return false if the number is less than 1
        if (number < 1) {
            return false;
        }

        int properDivisor = 0;
        int sumOfProperDivisors = 0;

        // Iterate through all numbers less than the given number
        for (int i = 1; i < number; i++) {

            // If the current number is a divisor, add it to the sum of proper divisors
            if (number % i == 0) {
                properDivisor = i;
                sumOfProperDivisors += properDivisor;
            }
        }

        // Check if the sum of proper divisors is equal to the given number
        boolean status = false;
        if (number == sumOfProperDivisors) {
            status = true;
        }
        return status;
    }
}
