//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.
package Strings;
import java.util.Arrays;
public class validAnagram {
    public static void main(String[] args) {
        String s="car";
        String t="rac";
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String res1=new String(arr1);
        String res2=new String(arr2);
        System.out.print("Strings are Anagram: "+res1.equals(res2));
    }
}
