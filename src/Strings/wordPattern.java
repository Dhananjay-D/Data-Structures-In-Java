
//        Input: pattern = "abba", s = "dog cat cat dog"
//        Output: true
//        Example 2:
//
//        Input: pattern = "abba", s = "dog cat cat fish"
//        Output: false

package Strings;
import java.util.*;
public class wordPattern {
        public static boolean wordPattern(String pattern, String s) {
            HashMap<Character,String> map=new HashMap<>();
            String[] str=s.split(" ");
            char[] chr=pattern.toCharArray();
            for(int i=0;i<chr.length;i++){
                map.put(chr[i],str[i]);
            }

            for(int j=0;j<chr.length;j++){
                if(!map.get(chr[j]).equals(str[j])){
                    return false;
                }
            }

            return true;
        }

    public static void main(String[] args) {
        boolean res=wordPattern("abba","dog cat cat dog");
        System.out.println(res);
    }
}
