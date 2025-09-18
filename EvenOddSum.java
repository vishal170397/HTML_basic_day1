package Tasks;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0, oddSum = 0;

        System.out.print("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num; // add to even sum
            } else {
                oddSum += num;  // add to odd sum
            }
        }

        System.out.println("Sum of Even numbers: " + evenSum);
        System.out.println("Sum of Odd numbers: " + oddSum);

        sc.close();
    }
}
