/**
 * This class calculates the area of a circle and a rectangle.
 */
public class AreaCalculator {

    /**
     * Main method for testing the area calculation methods.
     *
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {

        // Calculate and print the area of a circle with radius 4
        System.out.println("The area of the circle is " + area(4));

        // Calculate and print the area of a rectangle with sides of length 2 and 3
        System.out.println("The area of the rectangle is " + area(2, 3));
    }

    /**
     * Calculate the area of a circle with a given radius.
     *
     * @param radius the radius of the circle
     * @return the area of the circle, or -1.0 if the radius is negative
     */
    public static double area(double radius) {

        // If the radius is negative, return -1.0 as an error value
        if (radius < 0) {
            return -1.0;
        } else {
            // Calculate and return the area of the circle using the formula: area = radius^2 * PI
            return (radius * radius * Math.PI);
        }
    }

    /**
     * Calculate the area of a rectangle with given side lengths.
     *
     * @param x the length of one side of the rectangle
     * @param y the length of the other side of the rectangle
     * @return the area of the rectangle, or -1.0 if either side length is negative
     */
    public static double area(double x, double y) {

        // If either side length is negative, return -1.0 as an error value
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            // Calculate and return the area of the rectangle using the formula: area = x * y
            return x * y;
        }
    }
}
