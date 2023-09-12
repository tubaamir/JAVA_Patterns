//Printing Pattern Solid Rhombus
/*
 *      ******
 *     ******
 *    ******
 *   ******
 */

import java.util.Scanner;

public class SolidRhombus {
    public static void main (String args[] ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            int spaces = n - i;
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
