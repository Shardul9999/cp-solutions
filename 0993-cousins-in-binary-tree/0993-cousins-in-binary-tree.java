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
    public boolean isCousins(TreeNode root, int a, int b) {
        if(a == b) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            boolean founda = false;
            boolean foundb = false;
            
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                
                if(temp.left != null && temp.right != null){
                    int x = temp.left.val;
                    int y = temp.right.val;
                    
                    if(x == a && y == b || x == b && y == a){
                        return false;
                    }
                }
                
                if(temp.val == a) founda = true;
                if(temp.val == b) foundb = true;
                
                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            
            if(founda && foundb) return true;
            if(founda || foundb) return false;  //optimization check if one of node is at diff level then they already are not cousins
        }
        return false;
    }
}