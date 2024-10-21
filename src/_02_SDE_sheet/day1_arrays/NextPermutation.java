package _02_SDE_sheet.day1_arrays;
import java.util.*;

public class NextPermutation {

    // solution 1 - optimal code ->
     public static void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
        // step 1 find breaking point
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        // if there is no breaking  point
        if(ind1==-1){
            reverse(nums,0);
        }

        else{
            // step 2 find next greater element and swap with ind2
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(nums,ind1,ind2);
            // step 3 reverse the rest right half
            reverse(nums,ind1+1);
        }
    }

    static void  swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    static void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};  // Example array

        // Find and print all permutations
        nextPermutation(nums);

        System.out.println("next permutation: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf(nums[i]+ " ");
        }
    }
    // optimal code ends here ;

//    solution 2
//     Function to generate all permutations
//    public static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        backtrack(result, new ArrayList<>(), nums);
//        return result;
//    }
//
//    // Helper function to generate permutations using backtracking
//    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
//        if (tempList.size() == nums.length) {
//            result.add(new ArrayList<>(tempList));  // Add the current permutation to the result
//        } else {
//            for (int i = 0; i < nums.length; i++) {
//                if (tempList.contains(nums[i])) continue; // Skip already added elements
//                tempList.add(nums[i]);  // Choose
//                backtrack(result, tempList, nums);  // Explore
//                tempList.remove(tempList.size() - 1);  // Un-choose (backtrack)
//            }
//        }
//    }
//
//    // Function to find the next permutation using brute force
//    public static List<Integer> nextPermutation(int[] nums) {
//        // Generate all permutations
//        List<List<Integer>> permutations = permute(nums);
//
//        // Find the current permutation index in the list
//        int index = -1;
//        for (int i = 0; i < permutations.size(); i++) {
//            if (permutations.get(i).equals(toList(nums))) {
//                index = i;
//                break;
//            }
//        }

//        // Return the next permutation, or the first if the current is the last
//        if (index == permutations.size() - 1) {
//            return permutations.get(0);  // Wrap around to the first permutation
//        } else {
//            return permutations.get(index + 1);  // Return the next permutation
//        }
//    }
//
//    // Helper function to convert array to list (to compare permutations)
//    private static List<Integer> toList(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        for (int num : nums) {
//            list.add(num);
//        }
//        return list;
//    }

//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};  // Example array
//
//        // Find and print all permutations
//        List<List<Integer>> permutations = permute(nums);
//        System.out.println("All permutations: ");
//        for (List<Integer> permutation : permutations) {
//            System.out.println(permutation);
//        }

        // Find and print the next permutation
//        List<Integer> nextPerm = nextPermutation(nums);
//        System.out.println("Next permutation: " + nextPerm);
//    }
}

/*
* class Solution {
    public void nextPermutation(int[] nums) {

        int ind1=-1;
        int ind2=-1;
        // step 1 find breaking point
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        // if there is no breaking  point
        if(ind1==-1){
            reverse(nums,0);
        }

        else{
            // step 2 find next greater element and swap with ind2
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(nums,ind1,ind2);
            // step 3 reverse the rest right half
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}

/ / brute force
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    // Function to generate all permutations
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    // Helper function to generate permutations using backtracking
    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));  // Add the current permutation to the result
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue; // Skip already added elements
                tempList.add(nums[i]);  // Choose
                backtrack(result, tempList, nums);  // Explore
                tempList.remove(tempList.size() - 1);  // Un-choose (backtrack)
            }
        }
    }

    // Function to find the next permutation using brute force
    public static List<Integer> nextPermutation(int[] nums) {
        // Generate all permutations
        List<List<Integer>> permutations = permute(nums);

        // Find the current permutation index in the list
        int index = -1;
        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(toList(nums))) {
                index = i;
                break;
            }
        }

        // Return the next permutation, or the first if the current is the last
        if (index == permutations.size() - 1) {
            return permutations.get(0);  // Wrap around to the first permutation
        } else {
            return permutations.get(index + 1);  // Return the next permutation
        }
    }

    // Helper function to convert array to list (to compare permutations)
    private static List<Integer> toList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};  // Example array

        // Find and print all permutations
        List<List<Integer>> permutations = permute(nums);
        System.out.println("All permutations: ");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }

        // Find and print the next permutation
        List<Integer> nextPerm = nextPermutation(nums);
        System.out.println("Next permutation: " + nextPerm);
    }
}
*/