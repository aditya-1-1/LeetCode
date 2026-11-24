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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        paths(root,ans,p,targetSum,0);
return ans;
         
    }
private void paths(TreeNode root,List<List<Integer>> ans, List<Integer> p , int t,int s){
        if(root == null){
            return;
        }
        s+= root.val;
        p.add(root.val);
        if(root.left == null && root.right == null){
            if(s == t){
                ans.add(new ArrayList<>(p));
            }
        }
        else{
            paths(root.left,ans,p,t,s);
            paths(root.right,ans,p,t,s);
        }
        p.remove(p.size()-1);

    }
}