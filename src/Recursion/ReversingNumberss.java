package Recursion;

public class ReversingNumberss {
    public static void reverseNumbs(int[] a,int l,int r){
        if(l>r){
            return;   // base condition
        }
        else {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
            reverseNumbs(a, l, r);
        }
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        reverseNumbs(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
