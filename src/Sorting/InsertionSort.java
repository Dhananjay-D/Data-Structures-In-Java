
//Idea:   Take an element from the unsorted array, place it in its corresponding
//        position in the sorted part, and shift the elements accordingly.

package Sorting;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};

        //Insertion sorting : Time Complexity -> o(n^2)
        for(int i=1; i<arr.length; i++) { // iterating in unsorted one
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                //Keep swapping
                arr[j+1] = arr[j];
                j--; // to break while loop / to create starting places in sorted array
            }
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
