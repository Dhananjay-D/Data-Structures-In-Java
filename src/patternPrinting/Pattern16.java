
//    1
//   121
//  12321
// 1234321

package patternPrinting;

public class Pattern16 {
    public static void main(String[] args) {
        int i, j, k, l;
        for (i = 1; i <= 4; i++) {
            // loop for printing spaces
            for (j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // loop for printing left half triangle
            for (k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // loop for printing right half triangle
            for (l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();

        }
    }
}
