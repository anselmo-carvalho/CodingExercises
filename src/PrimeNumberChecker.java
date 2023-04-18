// Class responsible for checking if a number is prime
public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Define the number to be checked
        int number = 13;
        // Call the isPrime method to determine if the number is prime
        boolean result = isPrime(number);
        // Print the result to the console
        System.out.println(number + " is prime? " + result);
    }

    // Method to check if a given number is prime
    public static boolean isPrime(int number) {
        // Return false if the number is less than or equal to 1
        if (number <= 1) return false;

        // Check if any number from 2 to the square root of the given number evenly divides it
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is evenly divisible by i, it's not prime
            if (number % i == 0) {
                return false;
            }
        }
        // If no divisors were found, the number is prime
        return true;
    }
}
