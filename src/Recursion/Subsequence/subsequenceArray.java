package Recursion;
//The time complexity of the subSec function is O(n * 2^n) where n is the length of the input array.
//This is because for each element in the array, we have two choices - either include it in the subsequence
//or exclude it....(take/not take)
//The space complexity is also O(n) where n is the length of the input array.

import java.util.ArrayList;
public class subsequenceArray {
    public static void subSec(int ind,int[] arr,ArrayList<Integer> li){
        if(ind>=arr.length){
            System.out.println(li);
            return;
        }
        li.add(arr[ind]); // to take particular index in subsequence
        subSec(ind+1,arr,li);
        li.remove(li.indexOf(arr[ind])); // not to take particular index in subsequence
        subSec(ind+1,arr,li);
    }
    public static void main(String[] args) {
        int[] arr={3,1,2};
        ArrayList<Integer> li=new ArrayList<>();
        subSec(0,arr,li);
    }
}