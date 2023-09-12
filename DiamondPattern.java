//Printing Pattern Number Pyramid
//This Java program prints the following pattern after being executed
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
        //for upper half
        for (int i=1; i<=n; i++) {
            int spaces = n-i;
            //loop for printing spaces
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //loop for peinting upper traingle
            /*
                      *
                     ***
                    *****
            */
            for (int j=i; j>=1; j--) {
                System.out.print("*");
            }
            for (int j=2; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // for lower part
        for (int i=n; i>=1; i--) {
            int spaces = n-i;
            //printing spaces
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //print lower remaing triangle
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
