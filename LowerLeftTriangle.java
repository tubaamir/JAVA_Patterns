//printing pattern 
/*
 *   * * * * *
 *   * * * * 
 *   * * * 
 *   * * 
 *   *
 */

import java.util.Scanner;

public class LowerLeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        //int m = sc.nextInt();
        for (int i=1; i<=n; i++ ) {
            for (int j=n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        sc.close();
    }
}