
// 1 2 3 
// 4 5 6 
// 7 8 9 
package patternPrinting;

public class Pattern11 {
    public static void main(String[] args) {
        int i, j;
        int count = 0;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}