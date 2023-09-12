//printing pattern
// This Java program prints the following pattern after being executed
/*
 *         *
 *       * *
 *     * * *
 *   * * * *
 */

import java.util.Scanner;

public class UpperRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        for (int i=1; i<=n; i++ ) {
            //printing spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //printing triangle
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
