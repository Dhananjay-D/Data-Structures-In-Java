package Interview_ONCAMPUS.Sliding_Window;
// Maximum Product Sub-array
// Solved using Sliding-Window

public class MAXPRODSUBARRAY {
    public int maxProduct(int[] nums) {
        int currP=1,maxP=Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }

        for(int k=1;k<=nums.length;k++){
            if(k==1){
                for(int i=0;i<nums.length;i++){
                    currP=currP*nums[i];
                    if(currP>maxP){
                        maxP=currP;
                    }
                    currP=1;
                }
            }else if(k==nums.length){
                currP=1;
                for(int i=0;i<nums.length;i++){
                    currP=currP*nums[i];
                }
                if(currP>maxP){
                    maxP=currP;
                }
            }else{
                currP=1;
                for(int i=0;i<k;i++){
                    currP=currP*nums[i];
                }
                if(currP>maxP){
                    maxP=currP;
                }
                for(int j=k;j<nums.length;j++){
                    if(currP!=0){
                        currP=currP/nums[j-k];
                        currP=currP*nums[j];
                    }
                    if(currP>maxP){
                        maxP=currP;
                    }
                }
            }
        }
        return maxP;
    }


    public static void main(String[] args) {
        MAXPRODSUBARRAY solution = new MAXPRODSUBARRAY();

        // Test case 1
        int[] nums1 = {-2,3,4,5};
        System.out.println("Max product of nums1: " + solution.maxProduct(nums1)); // Expected output: 60

    }
}
