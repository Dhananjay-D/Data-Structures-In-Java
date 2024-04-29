package Interview_ONCAMPUS.Bitwise_Manipulation;
// Setbits are the 1's that are present in binary form of an integer
public class SetBIts {
        public static  int hammingWeight(int n) {
            int count=0;
            while(n!=0){
                count += n&1;
                n=n>>1;
            }
            return count;
        }

    public static void main(String[] args) {
        int num=10;
        int res=hammingWeight(num);
        System.out.println("Number of Setbits in the given number is: "+res);
    }

}
