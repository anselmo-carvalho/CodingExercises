public class LargestPrime {

    public static void main(String[] args) {

        // Display the largest prime factor of various numbers
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(-1));
    }

    /**
     * Returns the largest prime factor of a given number.
     *
     * @param number The number whose largest prime factor is to be found.
     * @return The largest prime factor of the given number, or -1 if the number is less than or equal to 1.
     */
    public static int getLargestPrime(int number) {

        // Return -1 for numbers less than or equal to 1, as they don't have prime factors
        if (number <= 1) return -1;

        // Iterate from number/2 down to 2, checking for divisors
        // Optimization: Start at number/2, as no prime factor can be larger than number/2
        for (int i = number / 2; i >= 2; i--) {
            // If i is a divisor of the number, update the number to its largest prime factor
            if (number % i == 0) {
                number = i;
            }
        }
        // Return the largest prime factor found
        return number;
    }
}
