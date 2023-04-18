public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-123456);
    }
    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long YY = (((minutes / 60) / 24) / 365);
        long ZZ = (((minutes / 60) / 24) % 365);
        System.out.println(minutes + " min = " + YY +" y and " + ZZ + " d");
    }
}
