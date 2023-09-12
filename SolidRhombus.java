//Printing Pattern Solid Rhombus
//This Java program prints the following pattern after being executed
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
            //printing spaces
            int spaces = n - i;
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //printing rhombus
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
