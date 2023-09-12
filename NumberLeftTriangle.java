//printing pattern
/*
 *    1
 *    1 2
 *    1 2 3
 *    1 2 3 4
 */

import java.util.Scanner;

public class NumberLeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        //int m = sc.nextInt();
        for (int i=1; i<=n; i++ ) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}