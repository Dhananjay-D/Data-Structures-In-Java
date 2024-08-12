package Recursion;
// printing count of subsequences from array which results in sum = k;
import java.util.ArrayList;

public class countSubSequenceEqualToK{
    public static int sumsubSec(int ind,int[] arr,ArrayList<Integer> li,int sum,int count){

        if(ind>=arr.length){
            int s=0;
            for(int i=0;i<li.size();i++){
                s+=li.get(i);
            }
            if(s==sum){
//                System.out.println(li);
                count++;
            }
            return count;
        }
        li.add(arr[ind]); // to take particular index in subsequence
        int l=sumsubSec(ind+1,arr,li,sum,count);
        li.remove(li.indexOf(arr[ind])); // not to take particular index in subsequence
        int r=sumsubSec(ind+1,arr,li,sum,count);
        return l+r;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=5;
        int count=0;
        ArrayList<Integer> li=new ArrayList<>();
        int res=sumsubSec(0,arr,li,sum,count);
        System.out.println(res);
    }
}