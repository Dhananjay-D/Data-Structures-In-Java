
//Idea:   The inner loop selects the minimum element in the unsorted array
//        and places the elements in increasing order.


        package Sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        //selection sort: Time Complexity : O(n^2)
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
