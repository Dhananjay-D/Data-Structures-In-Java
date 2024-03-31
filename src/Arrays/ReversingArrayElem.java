import java.util.*;
public class ReversingArrayElem {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        reversingArray(arr);
        System.out.println("Array Elements are: "+Arrays.toString(arr));
    }
    static void reversingArray(int[] arr){
        int i,j,temp;
        for(i=0,j=arr.length-1;i<j;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
