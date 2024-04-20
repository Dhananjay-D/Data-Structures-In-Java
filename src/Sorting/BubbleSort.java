
//Idea:   if arr[i] > arr[i+1] swap them. To place the element in their
//        respective position, we have to do the following operation N-1 times.


        package Sorting;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        //bubble sorting algorithms  : Time Complexity -> o(n^2)
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
