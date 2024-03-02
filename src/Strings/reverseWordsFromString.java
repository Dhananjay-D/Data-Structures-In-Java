package Strings;


import java.util.Arrays;

public class reverseWordsFromString {
    static String reverseWords(String s) {
        // Split the string by spaces
        // split("\\s+") will split the string into string of array with separator as space or multiple spaces. \s+ is a regular expression for one or more spaces.
        String[] words = s.strip().split("\\s+");

        // Create a StringBuilder to build the reversed string
        StringBuilder sb = new StringBuilder();

        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" "); // Add a space between words except for the last one
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str="the sky is blue";
        String res=reverseWords(str);
        System.out.println(res);
    }
}
