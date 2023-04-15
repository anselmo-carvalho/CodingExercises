public class EqualityPrinter {

    // This program demonstrates how the printEqual method works by calling it with five sets of three integer arguments.
    public static void main(String[] args) {
        printEqual(2, 1, 1);
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }


    // This method checks if the three integer arguments are equal or different and prints a message accordingly.
    public static void printEqual(int first, int second, int third) {
        // If any of the arguments is negative, print "Invalid Value" and return.
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // If all three arguments are equal, print "All numbers are equal".
        if (first - second == 0) {
            if (second - third == 0) {
                System.out.println("All numbers are equal");
            }
            // If the first two arguments are equal but the third argument is different, print "Neither all are equal or different".
            else if (second - third != 0) {
                if (first - second != 0) {
                    System.out.println("All numbers are different");
                } else if (first - third != 0) {
                    System.out.println("Neither all are equal or different");
                }
            }
        }
        // If the first two arguments are different, check if the second and third arguments are different or if the first and third arguments are different.
        else if (second - third != 0) {
            if (first - third != 0) {
                System.out.println("All numbers are different");
            } else if (second - third != 0) {
                System.out.println("Neither all are equal or different");
            }
        }
        // If the first two arguments are different but the third argument is the same as the second argument, print "Neither all are equal or different".
        else {
            System.out.println("Neither all are equal or different");
        }
    }

}
