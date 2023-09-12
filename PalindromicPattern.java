//Printing Pattern Number Palindrome
//This Java program prints the following pattern after being executed
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
            //printing spaces
            int spaces = n-i;
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //printing left half triangle
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //printing remaining triangle
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}
