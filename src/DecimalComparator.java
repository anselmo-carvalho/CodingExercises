public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a = (int) (a * 1000);
        b = (int) (b * 1000);

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
  /*  This approach involves the following steps:

        1. Multiply the input double values a and b by 1000 to shift the decimal point three places to the right.
        2. Cast the resulting values to int to truncate the remaining decimal places.
        3. Compare the resulting int values for equality.
        4.Return true if the values are equal, otherwise return false.

        This is an efficient and straightforward approach for comparing two double numbers up to three decimal places. By using casting, it avoids the need for additional libraries or complex rounding logic.

        However, there are some trade-offs and nuances to consider:
        This approach relies on casting to truncate the decimal places, which may lead to unexpected results in some cases, especially when dealing with very large or very small numbers.
        The code does not handle edge cases, such as NaN and Infinity. If these values are possible inputs, you should add checks for these cases.*/