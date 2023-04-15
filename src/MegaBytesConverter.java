public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // Check for invalid input
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Calculate megabytes and remaining kilobytes
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;

        // Print the message
        System.out.printf("%d KB = %d MB and %d KB%n", kiloBytes, megaBytes, remainingKiloBytes);
    }
}
