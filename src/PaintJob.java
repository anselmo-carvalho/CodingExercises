// PaintJob class calculates the number of paint buckets required to paint a wall
public class PaintJob {

    // Main method for testing the getBucketCount methods
    public static void main(String[] args) {
        // Test case ONE: getBucketCount with width, height, areaPerBucket, and extraBuckets
        System.out.println("Case ONE:");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        // Test case TWO: getBucketCount with width, height, and areaPerBucket
        System.out.println();
        System.out.println("Case TWO:");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        // Test case THREE: getBucketCount with area and areaPerBucket
        System.out.println();
        System.out.println("Case THREE:");
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    // Method to calculate the number of buckets needed considering extra buckets
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // Check for invalid input
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        // Calculate wall area, total coverage from extra buckets, and remaining area to paint
        double wallArea = width * height;
        double totalCoverage = areaPerBucket * extraBuckets;
        double remainingArea = wallArea - totalCoverage;
        // Check if remaining area is already covered
        if (remainingArea <= 0) {
            return 0;
        }
        // Calculate and return the number of additional buckets needed
        return (int) Math.ceil(remainingArea / areaPerBucket);
    }

    // Method to calculate the number of buckets needed without considering extra buckets
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        // Check for invalid input
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        // Calculate wall area and required number of buckets
        double area = width * height;
        double totalBuckets = Math.ceil(area / areaPerBucket);
        // Return the total number of buckets needed
        return (int) totalBuckets;
    }

    // Method to calculate the number of buckets needed based on area and areaPerBucket
    public static int getBucketCount(double area, double areaPerBucket) {
        // Check for invalid input
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        // Calculate and return the number of buckets needed
        int numOfBuckets = (int) Math.ceil(area / areaPerBucket);
        return numOfBuckets;
    }
}
