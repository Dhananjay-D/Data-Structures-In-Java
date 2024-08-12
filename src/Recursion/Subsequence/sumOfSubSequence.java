package Recursion;
// prints the subsequence from array whose sum is equal to the specified one(k)
import java.util.ArrayList;

public class sumOfSubSequence {
    public static void sumsubSec(int ind,int[] arr,ArrayList<Integer> li,int sum){

        if(ind>=arr.length){
            int s=0;
            for(int i=0;i<li.size();i++){
                s+=li.get(i);
            }
            if(s==sum){
                System.out.println(li);
            }
            return;
        }
        li.add(arr[ind]); // to take particular index in subsequence
        sumsubSec(ind+1,arr,li,sum);
        li.remove(li.indexOf(arr[ind])); // not to take particular index in subsequence
        sumsubSec(ind+1,arr,li,sum);
    }

    public static void main(String[] args) {
        int[] arr={1,2,1};
        int sum=2;
        ArrayList<Integer> li=new ArrayList<>();
        sumsubSec(0,arr,li,sum);
    }
}