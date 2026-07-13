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
class BSTIterator {
    private Stack<TreeNode> st;

    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        TreeNode temp = root;
        while(temp != null){
            st.push(temp);
            if(temp.left != null){
                temp = temp.left;
            }
            else{
                break;
            }
        }
    }
    
    public int next() {
        TreeNode temp = st.pop();
        TreeNode curr = temp;

        if(curr.right != null){
            curr = curr.right;
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
        }
        return temp.val;
    }
    
    public boolean hasNext() {
        if(!st.isEmpty()) return true;
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */