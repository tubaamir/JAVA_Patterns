//printing pattern floyd"s triangle
/*
 *    1
 *    2  3
 *    4  5  6
 *    7  8  9  10
 *    11 12 13 14 15
 */

import java.util.Scanner;

public class NumberTriangle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int n = sc.nextInt();
        //int m = sc.nextInt();
        for (int i=1; i<=n; i++ ) {
            for (int j=1; j<=i; j++) {
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}