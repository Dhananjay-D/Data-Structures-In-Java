package Recursion.Subsequence;
// printing count of subsequences from array which results in sum = k;
public class countSubSequenceEqualToK {
    public static  int countSS(int ind,int[] arr,int sum,int k){
        if(sum>k) return 0;
        if(ind==arr.length){
        if(sum==k){
            return 1;
        }
            return 0;
        }
        sum=sum+arr[ind];
        int l=countSS(ind+1,arr,sum,k);

        sum=sum-arr[ind];
        int r=countSS(ind+1,arr,sum,k);

        return l+r;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1};
        int k=2;
        int sum=0;
        int ind=0;
        int count=countSS(ind,arr,sum,k);
        System.out.println(count);
    }
}
