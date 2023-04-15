public class EvenDigitSum {

    public static void main(String[] args) {

        int number = -22;
        System.out.println("The sum of the even digits (" + number + ") is " + getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0 ) {
            return -1;
        }
        int reverse = 0;
        int compareNumber = number;
        int sumEvenDigits = 0;

        while(number != 0) {

            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                sumEvenDigits += lastDigit;
            }
            number /= 10;
        }
        return sumEvenDigits;
    }
}

