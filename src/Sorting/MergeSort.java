// Merge Sort follows divide and conquer technique for sorting the array
// Time Complexity : o(n * logn)
// Space Complexity : o(n)
// Implemented using Recursion
// Striver

package Sorting;
import java.util.Arrays;
public class MergeSort {
    public static void conquer(int[] arr,int si,int mid,int ei){
        // new array to store results of sorted one
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }else{
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }

        while(idx1<=mid){
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }

        while(idx2<=ei){
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }

        //to copy the content to original array
        for(int i=0,j=si;i< merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void divide(int[] arr,int st,int en){
        //base condition
        if(st>=en){
            return;
        }

        int mid=st+(en-st)/2;
        divide(arr,st,mid);
        divide(arr,mid+1,en);
        conquer(arr,st,mid,en);
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}