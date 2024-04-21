//      Given an integer n, return a string array answer (1-indexed) where:
//
//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i (as a string) if none of the above conditions are true.

//              LEETCODE PROBLEM

import java.util.*;
public class FizzBuzz {
        public static void fizzBuzz(int n) {
            List<String> li=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(i%3==0 && i%5==0){
                    li.add("FizzBuzz");
                }
                else if(i%3==0){
                    li.add("Fizz");
                }
                else if(i%5==0){
                    li.add("Buzz");
                }
                else{
                    li.add(String.valueOf(i));
                }
            }
            System.out.println(li);
        }

    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
