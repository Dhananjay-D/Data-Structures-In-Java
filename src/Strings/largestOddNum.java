//You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
//
//        A substring is a contiguous sequence of characters within a string.
//
//
//
//        Example 1:
//
//        Input: num = "52"
//        Output: "5"
//        Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
//        Example 2:
//
//        Input: num = "4206"
//        Output: ""
//        Explanation: There are no odd numbers in "4206".
//        Example 3:
//
//        Input: num = "35427"
//        Output: "35427"
//        Explanation: "35427" is already an odd number.

package Strings;
import java.util.ArrayList;
public class largestOddNum {

        public static String largestOddNumber(String num) {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(Integer.parseInt(num));
            int length=num.length();
            for(int i=0,j=i+1;i<=length-1;i++,j++){
                list.add(Integer.parseInt(num.substring(i,j)));
            }
            System.out.println(list);
            int max=0;
            for(int j=0;j<list.size();j++){
                if(list.get(j)%2!=0){
                    if(list.get(j)>=max){
                        max=list.get(j);
                    }
                }
            }

            if(max==0){
                return "";
            }
            else{
                return String.valueOf(max);  // for converting into String datatype
            }

        }

    public static void main(String[] args) {
        String s="10133890";
        String res= largestOddNumber(s);
        System.out.println(res);
    }
}
