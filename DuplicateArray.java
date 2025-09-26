package Tasks;
import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take user input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");

        // Check for duplicates
        boolean hasDuplicate = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    hasDuplicate = true;
                    break; // to avoid printing same duplicate multiple times
                }
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicates found.");
        }

   
    }
}
