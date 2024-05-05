package Interview_ONCAMPUS;
// Leetcode 53: Maximum Subarray (Kadane's Algorithm )
// Time Complexity : O(n)
public class maxSubArray {
        public static int maxSubArray(int[] nums) {
            if(nums.length==0){
                return 0;
            }
            int max=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
                if(sum>max){
                    max=sum;
                }

                if(sum<0){
                    sum=0;
                }
            }
            return max;
        }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int max=maxSubArray(arr);
        System.out.println(max);
    }
    }

