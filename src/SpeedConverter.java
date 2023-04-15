public class SpeedConverter {

    // Main function
    public static void main(String[] args) {

        // Define kilometers per hour
        double kilometersPerHour = 75.114d;
        // Call printConversion function to convert and display result
        printConversion(kilometersPerHour);
    }

    /**
     * Convert kilometers per hour to miles per hour.
     * @param kilometersPerHour Input in kilometers per hour
     * @return Converted value in miles per hour, rounded to the nearest whole number. Returns -1 if input is negative.
     */
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return (-1);
        } else {
            // Convert kilometers per hour to miles per hour
            kilometersPerHour /= 1.609;
            // Round the result and return
            return (Math.round(kilometersPerHour));
        }
    }

    /**
     * Print the conversion of kilometers per hour to miles per hour.
     * @param kilometersPerHour Input in kilometers per hour
     */
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0.0d) {
            // Call the toMilesPerHour function and display the result
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            // Print "Invalid Value" if input is negative
            System.out.println("Invalid Value");
        }
    }
}
