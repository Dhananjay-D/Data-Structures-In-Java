package Interview_ONCAMPUS;
//•	Write a program to swap two values of two variables without using third variable.
public class Swap_Numbers {
    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println(a+" "+b);
        System.out.println("Using Math Operators : ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        a=5;
        b=10;
        System.out.println("Using Bit Manipulation : ");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
        // third method is our regular using temp 3rd variable
    }
}
