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
    public static void printEqual (int firstNum, int secondNum, int thirdNum){
        if (firstNum <0 || secondNum <0 || thirdNum <0){
            System.out.println("Invalid Value");
        }else if (secondNum == thirdNum && thirdNum == firstNum){
            System.out.println("All numbers are equal");
        }else if (firstNum != secondNum && secondNum != thirdNum && thirdNum != firstNum){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}
