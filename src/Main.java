import java.util.ArrayList;
import java.util.List;

class Solution {
    // Function to find the pair with the maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Initialize the maximum sum with the sum of the first pair
        int ans = arr.get(0) + arr.get(1);

        // Loop through the list and find the maximum sum of adjacent pairs
        for (int i = 1; i < arr.size() - 1; i++) {
            int currentSum = arr.get(i) + arr.get(i + 1);
            ans = Math.max(ans, currentSum);
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Solution object
        Solution solution = new Solution();

        // Create a list of integers
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(8);
        arr.add(6);
        arr.add(7);
        arr.add(9);
        arr.add(9);
        arr.add(9);

        // Call the method and print the result
        int result = solution.pairWithMaxSum(arr);
        System.out.println("The maximum sum of adjacent pairs is: " + result);
    }
}
