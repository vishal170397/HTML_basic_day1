package Teaching;
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] numbers = new int[n];

        // Input elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Arrays to store even and odd numbers (maximum size n)
        int[] even = new int[n];
        int[] odd = new int[n];
        int evenCount = 0, oddCount = 0;

        // Separate even and odd
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                even[evenCount++] = numbers[i];
            } else {
                odd[oddCount++] = numbers[i];
            }
        }

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }

        // Print odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        scanner.close();
    }
}