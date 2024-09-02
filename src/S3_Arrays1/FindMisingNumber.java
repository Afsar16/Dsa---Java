package S3_Arrays1;

public class FindMisingNumber {
/*
/ / using sorting
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}

/ / using sum of natural numbers
import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n+1)) / 2;
        int ans = 0;

        for(int i=0; i<nums.length; i++) {
            ans = ans + nums[i];
        }

        return sum - ans;
    }
}

/ / using bit manipulation
import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int i=0; i<=n; i++) {
            xor = xor ^ i;
        }

        for(int i=0; i<n; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}

/ / one more bit manipulation code
  public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xor_all = 0;
        int xor_array = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor_all ^= i;
        }

        // XOR all numbers in the array
        for (int num : nums) {
            xor_array ^= num;
        }

        // The missing number is the XOR of xor_all and xor_array
        return xor_all ^ xor_array;
    }*/
}
