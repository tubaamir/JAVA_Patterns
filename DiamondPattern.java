//Printing Pattern Number Pyramid
/*
 *      *
 *     ***
 *    *****
 *    *****
 *     ***
 *      *
 */

import java.util.Scanner;

public class DiamondPattern {
    public static void main (String args[] ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            int spaces = n-i;
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print("*");
            }
            for (int j=2; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i=n; i>=1; i--) {
            int spaces = n-i;
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print("*");
            }
            for (int j=2; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        sc.close();
    }
}
