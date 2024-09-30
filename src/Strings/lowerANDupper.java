package Strings;

import java.util.Scanner;
public class lowerANDupper{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        int l=0,u=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                u++;
            }
        }
        l=str.length()-u;
        System.out.println("lower case: "+l+"\nupper case: "+u);
    }
}