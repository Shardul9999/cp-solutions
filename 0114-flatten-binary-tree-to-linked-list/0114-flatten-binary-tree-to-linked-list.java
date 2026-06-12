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
    public void preorder(TreeNode root, List<TreeNode> linkedlist){
        if(root == null){
            return;
        }
        linkedlist.add(root);
        preorder(root.left, linkedlist);
        preorder(root.right, linkedlist);
    }

    public void flatten(TreeNode root) {
        List<TreeNode> linkedlist = new ArrayList<>();
        preorder(root, linkedlist);

        for(int i=0; i < linkedlist.size()-1; i++){
            linkedlist.get(i).left = null;
            linkedlist.get(i).right = linkedlist.get(i+1);
        }
    }
}