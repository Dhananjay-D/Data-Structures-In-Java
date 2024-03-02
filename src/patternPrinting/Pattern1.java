//programm to print 5 row and 5 column star box pattern

// *****
// *****
// *****
// *****
// *****

package patternPrinting;

public class Pattern1 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}