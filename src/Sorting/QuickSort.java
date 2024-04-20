// Time Complexity:  Average ---> o(n * logn)
//                   Worst   ---> o(n^2)
// Worst case occurs when pivot is smallest/largest element

package Sorting;
import java.util.Arrays;
public class QuickSort {

    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap with pivot
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }

    public static void QuickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);

            QuickSort(arr,low,pi-1);
            QuickSort(arr,pi+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        int n=arr.length;
        QuickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
