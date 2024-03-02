
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

package patternPrinting;

public class Pattern5 {
    public static void main(String[] args) {
        int i, j, p, q;

        //we can divide a pattern into 2 parts and further can print pattern using two for loops separately

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (p = 1; p <= 4; p++) {
            for (q = 0; q <= 4 - p; q++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}