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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<List<Integer>> lis = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        int currentlevel = 1;
        while(!q.isEmpty()){
            int q_len = q.size();
            List<Integer> ans = new ArrayList<>();

            for(int i=0; i < q_len; i++){
                TreeNode temp = q.poll();
                ans.add(temp.val);

                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            if(currentlevel % 2 == 0){
                Collections.reverse(ans);
                lis.add(ans);
            }
            else{
                lis.add(ans);
            }
            currentlevel++;
        }

        return lis;
    }
}