package Tasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input like: 12345
        String s = sc.next().trim();
        

        // Print characters in reverse order (no arrays used)
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
