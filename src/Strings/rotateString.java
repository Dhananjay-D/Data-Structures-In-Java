// Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//        A shift on s consists of moving the leftmost character of s to the rightmost position.
//
//        For example, if s = "abcde", then it will be "bcdea" after one shift.

package Strings;

import java.sql.SQLOutput;

public class rotateString {
    public static boolean rotatString(String s, String goal) {
        char[] arr=s.toCharArray();
        String res="";
        int count=0;
        char temp = 'a';
        while(count<arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                } else if (i == arr.length - 1) {
                    arr[i] = temp;
                } else {
                    arr[i] = arr[i + 1];
                }
            }
            res = String.valueOf(arr);  // to convert array of characters into a string
            if(res.equals(goal)){
                return true;
            }
            count++;
        }
        return false;
    }

    public static void main(String[] args) {
        String str1="abcde";
        String str2="cdeab";
        boolean res=rotatString(str1,str2);
        System.out.println("Strings are equal: "+res);
    }
}