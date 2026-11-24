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
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        int lvl = 0;
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0;i<s;i++){
                TreeNode t = q.poll();
                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
                level.add(t.val);
            }
            if(lvl % 2 != 0) Collections.reverse(level);
            lvl++;
            ans.add(level); 
        }
        return ans;
    }
}