
// A B C 
// D E F 
// G H I 

package patternPrinting;

public class Pattern14 {
    public static void main(String[] args) {
        int i, j, count = 0;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                int n = 'A' + count;
                char ch = (char) n;
                System.out.print(ch + " ");
                count++;
            }
            System.out.println();
        }
    }
}
