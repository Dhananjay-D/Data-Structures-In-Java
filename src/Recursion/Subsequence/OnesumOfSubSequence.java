
package Recursion;
// prints the only one subsequence from array whose sum is equal to the specified one
        import java.util.ArrayList;

public class OnesumOfSubSequence {
    public static boolean onesumsubSec(int ind, int[] arr, ArrayList<Integer> li, int s, int sum){
        if(ind>=arr.length){
            if(s==sum){
                System.out.println(li);
                return true;
            }
            return false;
        }
        li.add(arr[ind]); // to take particular index in subsequence
        s=s+arr[ind];
        if(onesumsubSec(ind+1,arr,li,s,sum)==true){
            return true;
        }
        li.remove(li.indexOf(arr[ind])); // not to take particular index in subsequence
        s=s-arr[ind];
        if(onesumsubSec(ind+1,arr,li,s,sum)==true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
        int s=0;
        int sum=2;
        ArrayList<Integer> li=new ArrayList<>();
        onesumsubSec(0,arr,li,s,sum);
    }
}