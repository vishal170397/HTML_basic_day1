package Tasks;
import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array (5 elements)
        int arr1[] = new int[5];
        System.out.println("Enter 5 elements for first array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array (4 elements)
        int arr2[] = new int[4];
        System.out.println("Enter 4 elements for second array:");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }

        // Check lengths
        if (arr1.length == arr2.length) {
            System.out.println("Length is equal");
        } else {
            System.out.println("Length is not equal");
           
        }
    }
}
