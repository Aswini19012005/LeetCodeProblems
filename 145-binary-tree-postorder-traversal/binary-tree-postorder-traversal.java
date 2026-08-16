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
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer>l1=new ArrayList<>();
        postorder(root,l1);

        
        return l1;
    }
    public void postorder(TreeNode root,List<Integer> res ){
        if(root==null) return ;
        
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);

    }
}