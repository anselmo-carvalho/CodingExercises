public class LeapYear {

    public static void main(String[] args) {
        // Determine if the year 2000 is a leap year and store the result in a boolean variable
        boolean state = isLeapYear(2000);

        // Print the result to the console
        System.out.println(state);
    }
    /**
     * Determine if a given year is a leap year.
     * A leap year is divisible by 4, but not divisible by 100 unless it's also divisible by 400.
     *
     * @param year The year to check for leap year status
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        boolean status;

        if ((year >= 1) && (year <= 9999)) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    status = (year % 400 == 0);
                } else status = true;
            } else status = false;
        } else status = false;
        return status;
    }
}
