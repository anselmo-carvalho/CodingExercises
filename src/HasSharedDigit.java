public class HasSharedDigit {

        // Main method
        public static void main(String[] args) {

            // Test the hasSharedDigit method with two numbers (12 and 13)
            System.out.println(hasSharedDigit(12, 13));
        }

        /**
         * This method checks if two integers (firstNumber and secondNumber) share at least one digit.
         * The method only works for numbers between 10 and 99 (inclusive).
         *
         * @param firstNumber  The first integer to be compared
         * @param secondNumber The second integer to be compared
         * @return true if the two numbers share at least one digit, false otherwise
         */
        public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

            // Check if firstNumber is out of the allowed range (10-99)
            if (firstNumber < 10 || firstNumber > 99){
                return false;
            }
            // Check if secondNumber is out of the allowed range (10-99)
            if (secondNumber < 10 || secondNumber > 99) {
                return false;
            }

            int testFirstNumber = firstNumber;
            int testSecondNumber = secondNumber;

            // Iterate through each digit of the first number
            while(testFirstNumber > 0) {
                int Digit1st = testFirstNumber % 10;
                testSecondNumber = secondNumber;
                // Iterate through each digit of the second number
                while (testSecondNumber > 0) {
                    int Digit2nd = testSecondNumber % 10;
                    // Compare the current digits of the two numbers
                    if (Digit1st == Digit2nd) {
                        return true;
                    }
                    // Move to the next digit in the second number
                    testSecondNumber /= 10;
                }
                // Move to the next digit in the first number
                testFirstNumber /= 10;
            }
            // Return false if no shared digits are found
            return false;
        }
    }

