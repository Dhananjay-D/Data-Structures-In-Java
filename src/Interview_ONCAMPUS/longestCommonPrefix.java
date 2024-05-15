// Prints the largest common string among the strings in stringArray
package Interview_ONCAMPUS;
import java.util.Arrays;
public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight","dog"};

        StringBuilder prefix=new StringBuilder();
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]==last[i]){
                prefix.append(first[i]);
            }
            else{
                break;
            }
        }
        System.out.println(prefix.toString());
            }
        }
