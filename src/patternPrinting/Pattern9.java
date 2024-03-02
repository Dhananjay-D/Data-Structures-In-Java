
//    1
//   212
//  32123
// 4321234
//  32123
//   212
//    1

package patternPrinting;

public class Pattern9 {
    public static void main(String[] args) {
        int i, j, k, l;
        for (i = 1; i <= 4; i++) {
            // for loop to print spaces
            for (j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // for loop for printing left triangle numbers
            for (k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // for loop for printing right triangle numbers
            for (l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }

        for (i = 1; i <= 3; i++) {
            // for loop for printing spaces
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // for loop for printing left bottom triangle
            for (k = 4 - i; k >= 1; k--) {
                System.out.print(k);
            }
            // for loop for printing right bottom triangle
            for (l = 2; l <= 4 - i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }

    }
}