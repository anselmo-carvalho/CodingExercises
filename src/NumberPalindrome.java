public class NumberPalindrome {

    public static void main(String[] args) {

        int testNumber = 11212;

        if (isPalindrome(testNumber) == true) {

            System.out.println("The number " + testNumber + " is a Palindrome!");
        } else {
            System.out.println("The number " + testNumber + " is NOT a Palindrome!");
        }
    }

    public static boolean isPalindrome( int number) {

        int reverse = 0;
        boolean status = false;
        int compareNumber = number;

        while(number != 0) {

            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;
        }
        if (compareNumber - reverse == 0) {
            status = true;
        }

        return status;
    }
}
