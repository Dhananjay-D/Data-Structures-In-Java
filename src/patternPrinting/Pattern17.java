package patternPrinting;

// 1    1
// 12  21
// 123321

public class Pattern17 {
    public static void numberCrown(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l=1,m=i;l<=i;l++,m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        numberCrown(3);
    }
}
