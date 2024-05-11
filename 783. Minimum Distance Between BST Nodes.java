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
    int prev = Integer.MAX_VALUE, ans = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        helper(root);

        return ans;
    }

    public void helper(TreeNode root) {
        if(root == null)return;
         helper(root.left);

        ans = Math.min(ans, Math.abs(root.val - prev));
        prev = root.val;

        helper(root.right);
    }
}
