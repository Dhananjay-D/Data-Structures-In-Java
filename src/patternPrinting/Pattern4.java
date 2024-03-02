
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

package patternPrinting;

public class Pattern4 {
        public static void main(String[] args) {
            int n=5;// the rows value will be given as an Input.
            int i, j;
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j+ " ");
                }
                System.out.println();
            }
        }
}
