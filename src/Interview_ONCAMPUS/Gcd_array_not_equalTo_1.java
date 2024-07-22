package Interview_ONCAMPUS;

// you are given two array A and B find number of pairs
// (i,j) such that gcd(a[i],b[j]!=1)

// The time complexity of the given solution is O(n^2)
// where n is the length of the arrays a and b.

public class Gcd_array_not_equalTo_1 {
    public static void main(String[] args) {
        int[] a={2,4};
        int[] b={4,2};
        int count=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(gcd(a[i],b[j])!=1){
                    count++;
                }
            }
        }

        System.out.println(count);

    }

    // gcd funct to get which is not equal to 1.
    public static int gcd(int a,int b){
        for(int i=2;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
}
