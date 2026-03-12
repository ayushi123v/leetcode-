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
        int maxsum =Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            DFS(root);
            return maxsum;

        }

        public int DFS(TreeNode node){
            if(node == null){
                return 0;
            }
            int left = Math.max(0,DFS(node.left));
            int right = Math.max(0,DFS(node.right));

            int currentpath = left+right+node.val;
            maxsum=Math.max(currentpath , maxsum);
            return node.val + Math.max(left,right);
        }
    
}