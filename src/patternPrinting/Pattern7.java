
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

//assume this pattern as :
// 0000*
// 000* *
// 00* * *
// 0* * * *
// * * * * * 
// +
// 0* * * * 
// 00* * *
// 000* *
// 0000* 

//step 1: divide complete into 2
//step 2: for first 5 rows print spaces as zero via one for loop and after that * via another for loop
//step 3: for second 4 rows print spaces as zero via one for loop and after that * via another for loop
//hence complete pattern is obtained

package patternPrinting;

public class Pattern7 {
    public static void main(String[] args) {
        int i, j, k;

        for (i = 1; i <= 5; i++) {
            // for loop to print space
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // for loop to print stars
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int p, q, r;
        for (p = 1; p <= 4; p++) {
            // for loop to print space
            for (q = 1; q <= p; q++) {
                System.out.print(" ");
            }
            // for loop to print stars
            for (r = 1; r <= 4 - p + 1; r++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
