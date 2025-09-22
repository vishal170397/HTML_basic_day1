package Tasks;




public class MinMax {
    public static void main(String[] args) {
        int arr[] = {10, 20, 5, 8, 25, 15, 5, 25}; // Example array

        // Initialize values
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            // For Min
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num > firstMin && num < secondMin) {
                secondMin = num;
            }

            // For Max
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num < firstMax && num > secondMax) {
                secondMax = num;
            }
        }

        System.out.println("2nd Minimum = " + secondMin);
        System.out.println("2nd Maximum = " + secondMax);
    }
}
