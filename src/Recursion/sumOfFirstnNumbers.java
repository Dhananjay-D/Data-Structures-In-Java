package Recursion;
public class sumOfFirstnNumbers {
    public static int sumNums(int n){
        if(n==0){
            return 0; // base condition
        }
        else{
            return n+sumNums(n-1);
        }
    }
    public static void main(String[] args) {
        int num=5;
        int res=sumNums(num);
        System.out.println("Sum of first numbers"+num+" are "+res);
    }
}