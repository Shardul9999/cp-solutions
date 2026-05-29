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
    private void Postorder(TreeNode root, List<Integer> lis){
        if(root == null) return;

        Postorder(root.left, lis);
        Postorder(root.right, lis);
        lis.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lis = new ArrayList<>();
        Postorder(root, lis);

        return lis;
    }
}