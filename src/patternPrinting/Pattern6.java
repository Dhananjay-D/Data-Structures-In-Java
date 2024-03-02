
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * *

package patternPrinting;

public class Pattern6 {
    public static void main(String[] args) {

        // outer for loop runs for total no of rows
        for (int i = 1; i <= 5; i++) {

            // this for loop helps in printing space.
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            // this for loop helps in printing star.
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // we are coming on new line once we have printed spaces and stars on particular
            // row
            System.out.println();
        }
    }
}