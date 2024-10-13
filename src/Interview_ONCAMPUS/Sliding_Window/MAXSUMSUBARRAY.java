package Interview_ONCAMPUS.Sliding_Window;
// Maximum sum sub-array of size k
// Implementation by Sliding window concept
// Time Complexity : O(N)

public class MAXSUMSUBARRAY {
    public static int ans(int[] nums,int k){
        int winSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            winSum=winSum+nums[i];
        }
        if(winSum>maxSum){
            maxSum=winSum;
        }
        for(int j=k;j<nums.length;j++){
            winSum=winSum-nums[j-k]+nums[j];
            if(winSum>maxSum){
                maxSum=winSum;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr={2,9,31,-4,21,7};// ans 48
        int k=3; // size of window
        int res=ans(arr,k);
        System.out.println("Maximum sum from sub-array of size 3 is: "+res);
    }
}
