package Strings;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder();
        System.out.println("enter a string to be reversed: ");
        String str=sc.next();
        s.append(str);
//        System.out.println("Reversed String: "+s.reverse());
        String revStr=s.reverse().toString();
        if(str.equals(revStr)){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }
    }

}
