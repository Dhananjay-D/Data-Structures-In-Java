//Given an alphanumeric string s, return the second largest numerical digit that appears in s,
// or -1 if it does not exist.
//
//        An alphanumeric string is a string consisting of lowercase English letters and digits.
//
//        Example 1:
//        Input: s = "dfa12321afd"
//        Output: 2
//        Explanation: The digits that appear in s are [1, 2, 3]. The second Largest digit is 2.

package Strings;


import java.util.*;
public class secondLargestNumber {
    public static int secondHighest(String s) {
        if(s.matches("[A-Za-z]+")){     // for checking whether string completely is alphabetic
            return -1;
        }
        ArrayList<Integer> li=new ArrayList<>();
        char[] cArray=s.toCharArray();
        for(int i=0;i<cArray.length;i++){
            String str=String.valueOf(cArray[i]);
            if(str.matches("[0-9]+")){      // if number then add it to arraylist
                li.add(Integer.parseInt(str));
            }
        }
        Collections.sort(li);
        int max=li.get(0);
        int temp=-1;
        for(int j=1;j<li.size();j++){
            if(li.get(j)>max){
                temp=max;
                max=li.get(j);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String s="gvdgf8344";
        int res=secondHighest(s);
        System.out.println("Second largest number is: "+res);
    }
}