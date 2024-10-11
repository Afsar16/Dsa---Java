package _01_DataStructures._05Trees;
import java.util.*;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1() {}
    TreeNode1(int val) { this.val = val; }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode1 root) {
        if(root == null) {
            return new ArrayList<>();
        }
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);
        root.right.left = new TreeNode1(6);
        root.right.right = new TreeNode1(7);

        // Create a Solution object and call the preorderTraversal method
        Solution solution = new Solution();
        List<Integer> result = solution.preorderTraversal(root);

        // Print the result
        System.out.println("Preorder Traversal: " + result);
    }
}
