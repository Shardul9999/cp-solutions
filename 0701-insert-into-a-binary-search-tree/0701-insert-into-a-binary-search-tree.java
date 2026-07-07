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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode value = new TreeNode(val);

        if (root == null) {
            return value;
        }

        TreeNode curr = root;
        
        while(curr != null){
            if(curr.val < val && curr.right != null){
                curr = curr.right;
            }
            else if(curr.val > val && curr.left != null){
                curr = curr.left;
            }
            else{
                break;
            }
        }
        
        if(curr.val < val){
            curr.right = value;
        }
        else{
            curr.left = value;
        }
        
        return root;
    }
}