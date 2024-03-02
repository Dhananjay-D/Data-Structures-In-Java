//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class rotateArray {

    public static void rotate(int[] nums, int k) {
        int i = 1;
        while (i <= k) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j >= 0; j--) {
                if (j == 0) {
                    nums[j] = temp;
                } else {
                    nums[j] = nums[j - 1];
                }

            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 2;
        rotate(nums, k);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}