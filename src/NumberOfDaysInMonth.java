public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        // Test cases for getDaysInMonth method
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(-1, -2020));
    }
    /**
     * Determines if the given year is a leap year.
     * A leap year is divisible by 4, except for years divisible by 100.
     * However, years divisible by 400 are also leap years.
     *
     * @param year The year to check for leap year status.
     * @return true if the year is a leap year, false otherwise.
     */
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else return true;
            } else return false;
        }
    }

    /**
     * Returns the number of days in the specified month of the given year.
     *
     * @param month The month for which the number of days is requested.
     * @param year The year in which the month occurs.
     * @return The number of days in the specified month, or -1 if the input is invalid.
     */
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    // Check for leap year to determine number of days in February
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
            }
            // All remaining months have 30 days
            return 30;
        }
    }
}
