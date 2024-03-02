// Program to find frequency of characters in the given string

package Strings;

public class frequencyOfCharInString {
    public static void main(String[] args) {
        int count=0;
        char ch='a';
        String s="dhananjay";


        char[] arr=s.toCharArray();
        for(char x:arr){
            if(String.valueOf(x).equals(String.valueOf(ch))){
                count++;
            }
        }

        System.out.println("The frequency of " +ch +" in the given string is: "+count);

    }
}
