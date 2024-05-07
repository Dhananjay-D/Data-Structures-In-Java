
//Leetcode 39. Combination Sum
// Time Complexity : 0(2^n * k)

package Recursion;

import java.util.*;
public class combinationSum1 {
    public static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList < > (ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public static void main(String[] args) {
        int candidates[] = {2,3,6,7};
        int target = 7;
        ArrayList<Integer> li=new ArrayList<>();
        List < List < Integer >> ans = new ArrayList < > ();
        findCombinations(0, candidates, target, ans, li);
        System.out.println(ans);
    }
}