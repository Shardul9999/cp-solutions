/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode, TreeNode> parent = new HashMap<>();

    void inorder(TreeNode root){
        if(root == null) return;

        if(root.left != null){
            parent.put(root.left, root);
        }
        inorder(root.left);
        if(root.right != null){
            parent.put(root.right, root);
        }
        inorder(root.right);
    }

    void BFS(TreeNode target, int k, List<Integer> ans){
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(target);
        Set<Integer> visited = new HashSet<>(); //For marking Visited nodes
        visited.add(target.val);

        while(!q.isEmpty()){
            int size = q.size();

            if( k == 0) break;

            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();

                //left child
                if(temp.left != null && !visited.contains(temp.left.val)){
                    q.offer(temp.left);
                    visited.add(temp.left.val);
                }

                //right child
                if(temp.right != null && !visited.contains(temp.right.val)){
                    q.offer(temp.right);
                    visited.add(temp.right.val);
                }

                //parent 
                if(parent.containsKey(temp) && !visited.contains(parent.get(temp).val)){
                    q.offer(parent.get(temp));
                    visited.add(parent.get(temp).val);
                }
            }
            k--;
        }

        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            ans.add(temp.val);
        }
        
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        inorder(root);

        BFS(target,k,ans);

        return ans;
    }
}