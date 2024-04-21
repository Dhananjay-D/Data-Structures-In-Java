package Interview_ONCAMPUS.Bitwise_Manipulation;
// Time Complexity : O(1) and Space Complexity : O(1)
public class noOfDigits {
    public static void main(String[] args) {
        int num= 82170;
        int base=10; // because, we want to know no of digits in decimal (i.e, 10)
        int ans= (int) (Math.log(num)/Math.log(base)) +1;
        System.out.println("in decimal no of digits is: "+ans);

        int x= 10;
        int b=2; // because, we want to know no of digits in binary (i.e, 2)
        int ans2= (int) (Math.log(x)/Math.log(b)) +1;
        System.out.println("in binary no of digits is: "+ans2);
    }
}
