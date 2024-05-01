package Recursion;
//509. Fibonacci Number -- leetcode
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
// such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
public class fibonacciSeries {
    public static int fibonnacis(int f,int s,int count,int n){
        count++;
        if(count==n){
            return f+s;  // base condition
        }else{
            return fibonnacis(s,f+s,count,n);
        }
    }
    public static void main(String[] args) {
        int count=1;
        int n=3;
        if(n==0){
            System.out.println(0);
        }else if(n==1){
            System.out.println(1);
        }
        int res= fibonnacis(0,1,count,n);
        System.out.println(n+"rd element is: "+res);
    }
}
