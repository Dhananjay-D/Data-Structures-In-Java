
//         1 
//       2 1 2 
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 

package patternPrinting;

public class Pattern8 {
    public static void main(String[] args) {
        int i, j, k, l;
        for (i = 1; i <= 5; i++) {
            // for loop to print spaces
            for (j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            // for loop to print left triangle numbers
            for (k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            // for loop for printing second right half triangle
            for (l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}