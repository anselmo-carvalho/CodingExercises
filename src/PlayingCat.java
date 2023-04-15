// The PlayingCat class simulates a cat playing based on the temperature and if it's summer
public class PlayingCat {

    // The main method tests the isCatPlaying method with different inputs
    public static void main(String[] args) {

        // Test case 1: Summer and temperature is 10
        System.out.println(isCatPlaying(true, 10));
        // Test case 2: Not summer and temperature is 36
        System.out.println(isCatPlaying(false, 36));
        // Test case 3: Not summer and temperature is 35
        System.out.println(isCatPlaying(false, 35));
    }

    // The isCatPlaying method checks if the cat is playing based on the provided parameters
    public static boolean isCatPlaying(boolean summer, int temperature) {

        // Variable to store the status of the cat playing
        boolean status = false;

        // If it's summer, check if the temperature is between 25 and 45 degrees (inclusive)
        if (summer) {
            status = (temperature >= 25 && temperature <= 45) ? true : false;
        }
        // If it's not summer, check if the temperature is between 25 and 35 degrees (inclusive)
        else {
            status = (temperature >= 25 && temperature <= 35) ? true : false;
        }
        // Return the status of the cat playing
        return status;
    }
}
