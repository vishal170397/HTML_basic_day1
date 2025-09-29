package Teaching;
public class OddEvenPattern {
    public static void main(String[] args) {
        int rows = 5;    // total rows
        int odd = 1;     // start odd numbers
        int even = 2;    // start even numbers

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {   // odd row → print odd numbers
                    System.out.print(odd + " ");
                    odd += 2;
                } else {            // even row → print even numbers
                    System.out.print(even + " ");
                    even += 2;
                }
            }
            System.out.println();
        }
    }
}
