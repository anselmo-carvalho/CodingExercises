public class FlourPacker {

    public static void main(String[] args) {

        // Test cases for the canPack method
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack (-3, 2, 12));
        System.out.println(canPack (2, 1, 5));
        System.out.println(canPack (4, 18, 19));
        System.out.println(canPack (6, 2, 17));
    }
    /**
     * Determines if the given number of big and small flour bags can be combined to reach the goal weight.
     *
     * @param bigCount   Number of big flour bags (5 kg each)
     * @param smallCount Number of small flour bags (1 kg each)
     * @param goal       The desired weight in kilograms
     * @return           true if the combination of big and small bags can reach the goal, false otherwise
     */
    public static boolean canPack(int bigCount, int smallCount, int goal){
        // Validate input: all parameters should be non-negative
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        // Use big bags to reduce the goal weight as much as possible
        while (bigCount > 0 && goal >= 5) {
            goal -= 5;
            bigCount--;
        }
        // Check if enough small bags are available to reach the remaining goal weight
        return smallCount >= goal;
    }
}
