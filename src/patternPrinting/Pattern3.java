
// * * * * *
// * * * * 
// * * *
// * * 
// *

package patternPrinting;

public class Pattern3 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
