package Recursion;
// prints the subsequence from array whose sum is equal to the specified one
import java.util.ArrayList;

public class sumOfSubSequence {
    public static void sumsubSec(int ind,int[] arr,ArrayList<Integer> li,int s,int sum){
        if(ind>=arr.length){
            if(s==sum){
                System.out.println(li);
            }
            return;
        }
        li.add(arr[ind]); // to take particular index in subsequence
        s=s+arr[ind];
        sumsubSec(ind+1,arr,li,s,sum);
        li.remove(li.indexOf(arr[ind])); // not to take particular index in subsequence
        s=s-arr[ind];
        sumsubSec(ind+1,arr,li,s,sum);
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
        int s=0;
        int sum=2;
        ArrayList<Integer> li=new ArrayList<>();
        sumsubSec(0,arr,li,s,sum);
    }
}