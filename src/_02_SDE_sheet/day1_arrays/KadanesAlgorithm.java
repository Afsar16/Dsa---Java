package _02_SDE_sheet.day1_arrays;

public class KadanesAlgorithm {
    public static int maxSubArray(int[] nums) {
        int maxsofar = nums[0];

        int curmax = nums[0];

        for(int i=1; i<nums.length; i++) {
            curmax = Math.max(nums[i], nums[i] + curmax);
            maxsofar = Math.max(curmax, maxsofar);
        }
        return maxsofar;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,-5,6,-6,6,-2,7};
        int res = maxSubArray(nums);
        System.out.println(res);
    }

}
/*
* class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sum = 0;
        for(int i=0; i<n; i++) {
            if(sum < 0 ) {
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}

// nihkil lohia solution
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar = nums[0];

        int curmax = nums[0];

        for(int i=1; i<nums.length; i++) {
            curmax = Math.max(nums[i], nums[i] + curmax);
            maxsofar = Math.max(curmax, maxsofar);
        }
        return maxsofar;
    }
}

*/