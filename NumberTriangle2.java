//printing pattern
// This Java program prints the following pattern after being executed
/*
 *    4 3 2 1
 *    4 3 2
 *    4 3
 *    4
 */

import java.util.Scanner;

public class NumberTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        for (int i=1; i<=n; i++ ) {
            for (int j=n; j>=i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
