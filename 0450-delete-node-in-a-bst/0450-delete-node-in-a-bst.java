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
    public TreeNode HelpDelete(TreeNode root){
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
        else{
            TreeNode rightchild = root.right;
            TreeNode leftSub_lastRight = findLastRight(root.left);
            leftSub_lastRight.right = rightchild;
            return root.left;
        }
    }

    public TreeNode findLastRight(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){
            return HelpDelete(root);
        }

        TreeNode dummy = root;
        while(root != null){
            if(root.val > key){    //key in leftsubtree
                if(root.left != null && root.left.val == key){
                    root.left = HelpDelete(root.left);
                    break;
                }
                else{
                    root = root.left;
                }
            }
            else{                  //key in rightsubtree
                 if(root.right != null && root.right.val == key){
                    root.right = HelpDelete(root.right);
                    break;
                }
                else{
                    root = root.right;
                }
            }
        }

        return dummy;
    }
}