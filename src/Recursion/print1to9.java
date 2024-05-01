package Recursion;

public class print1to9 {
    public static void linear(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        linear(i+1,n);
    }
    public static void main(String[] args) {
        int num=10,i=1;
        linear(i,num);
    }
}
