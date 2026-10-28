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
    public static void helper(ArrayList<Integer> ans, TreeNode root){
        if(root == null) return;
        helper(ans, root.left);
        ans.add(root.val);
        helper(ans, root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(ans, root);
        int min = Integer.MAX_VALUE;
        for(int i  = 1; i < ans.size(); i++){
            min = Math.min(ans.get(i) - ans.get(i-1), min);
        }
        return min;
    }
}