package Arrays;

import java.util.*;

public class SumOfTwoAsTarget {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 6, 9 };
        int target = 15;
        int[] ans = twoSum(arr, target);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i, j, sum;
        int n = nums.length;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { 0, 0 };
    }

}
