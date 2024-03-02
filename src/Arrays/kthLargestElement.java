
//215. Kth Largest Element in an Array
//        Solved
//        Medium
//        Topics
//        Companies
//        Given an integer array nums and an integer k, return the kth largest element in the array.
//
//        Note that it is the kth largest element in the sorted order, not the kth distinct element.

//        Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//        Output: 4


package Arrays;

import java.util.*;
public class kthLargestElement {
    public static  int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int item:nums){
            li.add(item);
        }
        Collections.sort(li);
        return li.get(li.size()-k);
    }

    public static void main(String[] args) {
        int[] arr={3,2,3,1,2,4,5,5,6};
        int k=4;
        int res=findKthLargest(arr,k);
        System.out.println("kth largest elem is: "+res);
    }
}