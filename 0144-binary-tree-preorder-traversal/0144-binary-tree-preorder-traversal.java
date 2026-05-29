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
    private void Preorder(TreeNode root, List<Integer> lis){
        if(root == null) return;

        lis.add(root.val);
        Preorder(root.left, lis);
        Preorder(root.right, lis);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lis = new ArrayList<>();
        Preorder(root, lis);

        return lis;
    }
}