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
    public List<List<Integer>> pathSum(TreeNode root, int targetsum) {
        List <List<Integer>> result = new ArrayList<>();
        List <Integer> path = new ArrayList<>();

        dfs(root , targetsum , result , path );
        return result ; 
    }

    public void dfs (TreeNode node , int targetsum , List<List<Integer>> result , List<Integer> path ){
         if(node == null ){
            return ; 
         }
         path.add(node.val);
         if(node.left == null && node.right == null && node.val==targetsum){
            result.add(new ArrayList<>(path));
         }

         dfs(node.left , targetsum-node.val , result , path); 
         dfs(node.right , targetsum-node.val, result, path);
         
         path.remove(path.size()-1);

    }
}