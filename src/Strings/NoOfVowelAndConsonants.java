package Strings;
public class NoOfVowelAndConsonants {
    public static void main(String[] args){
        String name="dhananjay";
        int countVow=0;
        for(int i=0;i<name.length();i++){
            if(String.valueOf(name.charAt(i)).matches("[aeiou]+")){
                countVow++;
            }
        }
        System.out.println("Number of Vowels: "+countVow);
        int countConso=name.length()-countVow;
        System.out.println("Number of Consonants: "+countConso);
    }
}
