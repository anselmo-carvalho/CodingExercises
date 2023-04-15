public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println("Number 252 have a sum of first and last digits = " +
                sumFirstAndLastDigit(-10) );
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
        int reverse = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        int sequence = 0;

        lastDigit = number % 10;

        while(number != 0) {

            firstDigit = number;
            sequence = number % 10;
            reverse = reverse * 10;
            reverse += sequence;
            number /= 10;
        }

        return (firstDigit + lastDigit);

    }
}
