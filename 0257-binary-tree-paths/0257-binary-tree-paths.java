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
    void Allpaths(TreeNode root, String str, List<String> ans){
        if(root.left == null && root.right == null){
            ans.add(str);
            return;
        }

        if(root.left != null){
            Allpaths(root.left, str + "->" + root.left.val, ans);
        }

        if(root.right != null){
            Allpaths(root.right, str + "->" + root.right.val, ans);
        }
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String str = "" + root.val;

        Allpaths(root,str,ans);
        return ans;
    }
}