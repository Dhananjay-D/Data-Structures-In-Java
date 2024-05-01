package Recursion;

// This program helps in finding factorial of given number using Recursion
// Time complexity is O(n) where n is the given number.
// Space complexity is also O(n) because each recursive call adds a new frame to the call stack,
// which requires additional memory.

public class factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args){
        int num=4;
        int fact=fact(num);
        System.out.println("Factorial of number "+num+" is: "+fact);
    }
}