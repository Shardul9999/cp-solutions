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
    int result = 0;

    public int height(TreeNode root){
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int leftdiam = diameterOfBinaryTree(root.left);
        int rightdiam = diameterOfBinaryTree(root.right);
        int ans = height(root.left) + height(root.right);
        return Math.max(ans, Math.max(leftdiam, rightdiam));
    }
}