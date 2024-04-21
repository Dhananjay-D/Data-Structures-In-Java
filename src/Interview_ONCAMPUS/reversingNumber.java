import java.util.Scanner;
public class reversingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int x = sc.nextInt();
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        System.out.println("the reversed number is: " + rev);
    }
}
