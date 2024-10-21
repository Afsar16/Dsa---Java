package _02_SDE_sheet.day1_arrays;

public class Sortanarrayof_0s1sand2s {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int m = 0;

        while(m <= e) {

            switch(nums[m]) {
                case 0:
                    swap(nums,s,m);
                    m++;
                    s++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(nums,m,e);
                    e--;
                    break;
            }
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
* class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int m = 0;

        while(m <= e) {

            switch(nums[m]) {
                case 0:
                    swap(nums,s,m);
                    m++;
                    s++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(nums,m,e);
                    e--;
                    break;
            }
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// my solution
class Solution {
    public void sortColors(int[] nums) {
        int one = 0;
        int zero = 0;
        int j = 0;
        int k = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                one++;
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                zero++;
            }
        }

        for(int i=0; i<zero; i++) {
            nums[i] = 0;
            j++;
        }
        for(int i=zero; i<one+zero; i++) {
            nums[i] = 1;
            j++;
        }
        for(int i=j; i<nums.length; i++) {
            nums[i] = 2;
        }

    }
}
*/