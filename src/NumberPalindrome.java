// NumberPalindrome class checks if a number is a palindrome
public class NumberPalindrome {

    // Main method to test the isPalindrome method with a sample number
    public static void main(String[] args) {

        int testNumber = 11212;

        // Check if the testNumber is a palindrome and print the result
        if (isPalindrome(testNumber)) {
            System.out.println("The number " + testNumber + " is a Palindrome!");
        } else {
            System.out.println("The number " + testNumber + " is NOT a Palindrome!");
        }
    }

    /**
     * Checks if a given number is a palindrome.
     *
     * @param number The number to be checked.
     * @return true if the number is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int number) {

        int reverse = 0;
        boolean status = false;
        int compareNumber = number;

        // Reverse the number
        while (number != 0) {

            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;
        }
        // Check if the original number and the reversed number are equal
        if (compareNumber - reverse == 0) {
            status = true;
        }

        return status;
    }
}
