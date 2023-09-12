//printing pattern rectangular hollow block
// This Java program prints the following pattern after being executed
/*
 *   * * * * *
 *   *        *
 *   *        *
 *   * * * * *
 */

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input rows
        int n =sc.nextInt();
        //input columns
        int m = sc.nextInt();
        
        for (int i=1; i<=n; i++ ) {
            for (int j=1; j<=m; j++) {
                //checking conditions for printing stars and spaces
                if ( i == 1 || j == 1 || i == n || j == m ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
