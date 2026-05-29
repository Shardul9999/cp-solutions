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
    private void Inorder(TreeNode root, List<Integer> lis){
        if(root == null) return;

        Inorder(root.left, lis);
        lis.add(root.val);
        Inorder(root.right, lis);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lis = new ArrayList<>();
        Inorder(root, lis);

        return lis;
    }
}