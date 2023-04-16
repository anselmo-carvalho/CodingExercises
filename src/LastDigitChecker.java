/**
 * LastDigitChecker class contains methods to check if given numbers have the same last digit,
 * and to validate if a number is within a specific range.
 */
public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println("Test hasSameLastDigit method:");
        System.out.println(hasSameLastDigit(41, 22, 71)); // Expected output: true
        System.out.println(hasSameLastDigit(23, 32, 42)); // Expected output: true
        System.out.println(hasSameLastDigit(9, 99, 999)); // Expected output: false

        System.out.println("-------------------");

        System.out.println("Test isValid method:");
        System.out.println(isValid(10)); // Expected output: true
        System.out.println(isValid(468)); // Expected output: true
        System.out.println(isValid(1051)); // Expected output: false
    }

    /**
     * Checks if any two of the given numbers have the same last digit.
     *
     * @param number1 First number to check
     * @param number2 Second number to check
     * @param number3 Third number to check
     * @return true if any two numbers have the same last digit, false otherwise
     */
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        // Check if numbers are within valid range (10 to 1000)
        if ((number1 < 10 || number1 > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 1000)) {
            return false;
        }

        // Calculate last digits of the numbers
        int lDN1 = number1 % 10;
        int lDN2 = number2 % 10;
        int lDN3 = number3 % 10;

        // Check if any two last digits are equal
        return ((lDN1 == lDN2) || (lDN1 == lDN3)) || (lDN2 == lDN3);
    }

    /**
     * Checks if a number is within the valid range (10 to 1000).
     *
     * @param number Number to validate
     * @return true if the number is within the range, false otherwise
     */
    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}

