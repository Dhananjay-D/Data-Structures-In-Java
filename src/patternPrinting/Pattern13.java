
// 1
// 22
// 333
// 4444
// 55555
// 666666

package patternPrinting;

public class Pattern13 {
    public static void main(String[] args) {
        int i, j, n;
        n = 6;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
