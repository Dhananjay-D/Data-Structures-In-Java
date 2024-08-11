package Recursion;
//509. Fibonacci Number -- leetcode
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
// such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
public class fibonacciSeries {
    public static int fibonnacis(int n){
      if(n<=1){
          return n;
      }
      int l=fibonnacis(n-1);
      int sl=fibonnacis(n-2);
      return l+sl;
    }
    public static void main(String[] args) {
        int n=6; // index no start from 0: 0 1 1 2 3 5 8 13
        int res= fibonnacis(n);
        System.out.println(n+"rd element is: "+res);
    }
}
