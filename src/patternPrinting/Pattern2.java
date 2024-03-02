
// *
// **
// ***
// ****

package patternPrinting;

public class Pattern2 {
    public static void main(String[] args) {
        int n=4;// the rows value will be given as an Input.
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
