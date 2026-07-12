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
    private int index = 0;

    public TreeNode fun(int minval, int maxval, int size, int[] arr){
        if(index == size) return null;

        if(arr[index] < minval || arr[index] > maxval) return null;

        TreeNode node = new TreeNode(arr[index]);
        index++;

        node.left = fun(minval, node.val, size, arr);
        node.right = fun(node.val, maxval, size, arr);

        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int size = preorder.length;

        return fun(-2000, 2000, size, preorder);
    }
}