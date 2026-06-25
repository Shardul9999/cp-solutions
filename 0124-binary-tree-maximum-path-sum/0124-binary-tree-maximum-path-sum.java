/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maximum = Integer.MIN_VALUE;

    public int fun(TreeNode root){
      if(root == null) return 0;

        int left = Math.max(0,fun(root.left));
        int right = Math.max(0,fun(root.right));
        int sum = root.val + left + right;

        maximum = Math.max(maximum, sum);

        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        int ans = fun(root);
        return maximum;
    }
}