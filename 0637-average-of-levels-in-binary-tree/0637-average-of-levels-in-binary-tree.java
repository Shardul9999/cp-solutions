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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> ans = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> num = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                num.add(temp.val);

                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            double avg = 0;
            double sum = 0;
            for(int a : num){
                sum += a;
            }
            avg = sum / num.size();

            ans.add(avg);
        }

        return ans;
    }
}