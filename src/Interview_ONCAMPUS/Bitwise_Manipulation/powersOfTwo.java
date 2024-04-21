package Interview_ONCAMPUS.Bitwise_Manipulation;
// pgm to find whether the number is 2 to the power or not
public class powersOfTwo {
    public static void main(String[] args) {
        int num=8;
        boolean res=(num & (num-1))==0;
        System.out.println(res);
    }
}
