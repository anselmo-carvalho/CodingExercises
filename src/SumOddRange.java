public class SumOddRange {

    // Main method to test the sumOdd method
    public static void main(String[] args) {
        System.out.println("The sum of odd numbers from 1 to 100 is " + sumOdd(1, 100));
    }

    // Method to check if a number is odd
    public static boolean isOdd(int number) {
        // Return false if the number is negative
        if (number < 0) {
            return false;
        }
        // Return false if the number is even
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    // Method to sum odd numbers in a given range
    public static int sumOdd(int start, int end) {
        int sum = 0;
        // Return -1 if input values are invalid
        if (start < 0 || end < 0 || start > end) {
            return -1;
        }
        // Loop through the range and add odd numbers to the sum
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}

