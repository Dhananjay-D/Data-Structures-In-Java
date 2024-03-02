
// 1 
// 2 3 
// 3 4 5 
// 4 5 6 7 

package patternPrinting;

public class Pattern12 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }
}