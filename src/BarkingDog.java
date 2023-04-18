public class BarkingDog {

    public static void main(String[] args) {
        // Call the shouldWakeUp method and print the result
        // false = Do not wake up
        // true = Wake up
        System.out.println(shouldWakeUp(false, 2));
    }
    /**
     * This method takes two parameters, a boolean barking and an integer hourOfDay.
     * It returns a boolean value indicating whether we should wake up or not.
     * If the dog is barking and the hourOfDay is between 0 and 23 inclusive,
     * and the hourOfDay is less than 8 or greater than 22, then we should wake up.
     * Otherwise, we should not wake up.
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean status = false;
        if (barking) {
            if ((hourOfDay < 0) || (hourOfDay > 23)) {
                status = false;
            } else if ((hourOfDay < 8) || (hourOfDay > 22)) {
                status = true;
            }
        }
        return status;
    }

}
