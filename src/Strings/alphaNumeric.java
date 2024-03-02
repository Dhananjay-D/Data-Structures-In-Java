// alphanumeric means true if all are either characters or numbers or combination of both
// alpha checks only for characters and return true or false
// numeric checks only for numbers and return true or false

package Strings;
import java.util.Scanner;

 public class alphaNumeric {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string1: ");
        String str=sc.nextLine();
        boolean res=str.matches("[A-Za-z0-9]+");
        System.out.println("String is a alphanumeric: "+res);

        System.out.println("Enter a string2: ");
        String str2=sc.nextLine();
        boolean res2=str2.matches("[A-Za-z]+");
        System.out.println("String is a alpha: "+res2);

        System.out.println("Enter a string3: ");
        String str3=sc.nextLine();
        boolean res3=str3.matches("[0-9]+");
        System.out.println("String is a numeric: "+res3);
    }
}


