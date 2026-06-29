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
class Pair{
    int index;
    TreeNode node;

    Pair(int index, TreeNode node){
        this.index = index;
        this.node = node;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Deque<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, root));
        int maxwidth = 0;

        while(!q.isEmpty()){
            int size = q.size();
            int startidx = q.peekFirst().index;
            int endidx = q.peekLast().index;

            maxwidth = Math.max(maxwidth, endidx - startidx + 1);
            
            for(int i=0; i<size; i++){
                Pair nodepair = q.pollFirst();
                int idx = nodepair.index;
                TreeNode node = nodepair.node;

                if(node.left != null){
                    q.offer(new Pair((2 * idx + 1), node.left));
                }
                if(node.right != null){
                    q.offer(new Pair((2 * idx + 2), node.right));
                }
            }
        }

        return maxwidth;
    }
}