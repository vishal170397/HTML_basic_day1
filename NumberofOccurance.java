package Tasks;
import java.util.Scanner;

public class NumberofOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // take array elements
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // take number to search
        System.out.print("Enter number to find occurrences: ");
        int x = sc.nextInt();

        int count = 0;

        // check occurrences
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println(x + " occurs " + count + " times.");
    }
}
