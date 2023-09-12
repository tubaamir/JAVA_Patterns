//Printing Pattern Number Pyramid
/*
 *       1
 *      212
 *     32123
 *    4321234
 */

import java.util.Scanner;

public class PalindromicPattern {
    public static void main (String args[] ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            int spaces = n-i;
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}
