public class TeenNumberChecker {

    /**
     * Main method that tests the hasTeen and isTeen methods.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("==> hasTeen");

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 134));

        System.out.println("==> isTeen");

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    /**
     * Checks if any of the three input numbers is a teen (between 13 and 19 inclusive).
     * @param a first number
     * @param b second number
     * @param c third number
     * @return true if any input number is a teen, false otherwise
     */
    public static boolean hasTeen(int a, int b, int c) {

        boolean status = false;

        if ( (a >= 13) && (a <= 19) ) {
            status = true;
        } else if ( (b >= 13) && (b <= 19) ) {
            status = true;
        } else if ( (c >= 13) && (c <= 19) ) {
            status = true;
        }
        return status;
    }

    /**
     * Checks if the input number is a teen (between 13 and 19 inclusive).
     * @param a input number
     * @return true if the input number is a teen, false otherwise
     */
    public static boolean isTeen(int a) {

        boolean status = false;

        if ( (a >= 13) && (a <= 19) ) {
            status = true;
        }
        return status;
    }
}
