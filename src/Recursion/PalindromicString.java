package Recursion;

public class PalindromicString {
    public static boolean palindromicc(char[] arr,int l,int r){
        if(l>=r){
            return true;
        }
        else{
            if(arr[l]!=arr[r]) {
                return false;
            }
            l++;
            r--;
            palindromicc(arr,l,r);
        }
        return true;
    }

    public static void main(String[] args) {
        String s="racecar";
        char[] arr=s.toCharArray();
        boolean res=palindromicc(arr,0,s.length()-1);
        System.out.println("String is Palindromic "+res);
    }
}
