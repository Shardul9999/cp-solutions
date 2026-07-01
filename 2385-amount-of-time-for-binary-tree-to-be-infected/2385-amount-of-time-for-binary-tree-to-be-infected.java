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
     HashMap<TreeNode,TreeNode> parent = new HashMap<>();
     TreeNode startNode = null;
     
    void inorder(TreeNode root, int start){
        if (root == null) return;
        
        if(root.val == start){
            startNode = root;
        }

        if (root.left != null){
            parent.put(root.left, root);
        }

        inorder(root.left, start);

        if (root.right != null){
            parent.put(root.right, root);
        }

        inorder(root.right, start);
    }
    
    int BFS(TreeNode start){
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(start);
        Set<Integer> visited = new HashSet<>();
        visited.add(start.val);
        
        int time = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            boolean burned = false;
            
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                
                if(temp.left != null && !visited.contains(temp.left.val)){
                    q.offer(temp.left);
                    visited.add(temp.left.val);
                    burned = true;
                }
                
                if(temp.right != null && !visited.contains(temp.right.val)){
                    q.offer(temp.right);
                    visited.add(temp.right.val);
                    burned = true;
                }
                
                if(parent.containsKey(temp) && !visited.contains(parent.get(temp).val)){
                    q.offer(parent.get(temp));
                    visited.add(parent.get(temp).val);
                    burned = true;
                }
            }
            if(burned) time++;
        }
        
        return time;
    }
    public int amountOfTime(TreeNode root, int start) {
        inorder(root,start);
        return BFS(startNode);
    }
}