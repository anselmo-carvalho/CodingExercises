public class NumberToWords {

/*
numberToWords method:
Checks if the input number is negative, and if so, prints "Invalid Value" and returns.
Reverses the input number using the reverse method.
Gets the digit count of the original number using the getDigitCount method.
Iterates through the reversed number, extracting the last digit and printing its corresponding word.
Removes the last digit from the reversed number.
Keeps track of the printed digits count and pads with "Zero" words if necessary.

reverse method:
Reverses the input number by iterating through its digits, starting from the last digit, and building a new reversed number.

getDigitCount method:
Returns the count of digits in the input number. If the number is negative, it returns -1 to indicate an invalid value.
It's used to print the correct number of trailing "0"s
 */
    public static void main(String[] args) {

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

        public static void numberToWords(int number) {
            if (number < 0) {
                System.out.println("Invalid Value");
            } else {
                int reversedNumber = reverse(number);
                int digitCount = getDigitCount(number);
                int printedDigits = 0;

                while (reversedNumber != 0) {
                    int lastDigit = reversedNumber % 10;

                    switch (lastDigit) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                    reversedNumber /= 10;
                    printedDigits++;
                }
                while (printedDigits < digitCount) {
                    System.out.println("Zero");
                    printedDigits++;
                }
            }
        }

        public static int reverse(int number) {
            int reversed = 0;
            while (number != 0) {
                reversed *= 10;
                reversed += number % 10;
                number /= 10;
            }
            return reversed;
        }

        public static int getDigitCount(int number) {
            if (number < 0) {
                return -1;
            }

            int count = 0;
            do {
                count++;
                number /= 10;
            } while (number != 0);

            return count;
        }
    }
