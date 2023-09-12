//Printing Pattern Number Pyramid
//This Java program prints the following pattern after being executed
/*
 *       1
 *      2 2
 *     3 3 3
 *    4 4 4 4
 *   5 5 5 5 5
 */

import java.util.Scanner;

public class NumberPyramid {
    public static void main (String args[] ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            //printing spaces
            int spaces = n-i;
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //printing pyramid
            for (int j=1; j<=i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
