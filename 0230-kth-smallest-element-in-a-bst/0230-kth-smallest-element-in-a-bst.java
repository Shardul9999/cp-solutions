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
    int count = 1;
    int ans;
    public void helper(TreeNode root, int k){
        if(root == null) return;

        helper(root.left, k);
        if(count == k){
            ans = root.val;
        }
        count++;
        helper(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        ans = -1;
        helper(root,k);
        return ans;
    }
}