package Interview_ONCAMPUS.Sliding_Window;
// Leetcode: 930. Binary Sub-arrays With Sum

//Example 1:
//Input: nums = [1,0,1,0,1], goal = 2
//Output: 4
//Explanation: The 4 sub-arrays are bolded and underlined below:
//[1,0,1,0,1]
//[1,0,1,0,1]
//[1,0,1,0,1]
//[1,0,1,0,1]



public class Binary_Subarrays_With_Sum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        for (int k = 1; k <= nums.length; k++) {
            for (int j = 0; j < k; j++) {
                sum += nums[j];
            }
            if (sum == goal) {
                count++;
            }
            for (int m = k; m < nums.length; m++) {
                sum = sum + nums[m] - nums[m - k];
                if (sum == goal) {
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        int result = numSubarraysWithSum(nums, goal);
        System.out.println("Number of subarrays with sum " + goal + ": " + result);
    }
}
