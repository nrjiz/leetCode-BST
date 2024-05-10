/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
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

    TreeNode ans = new TreeNode();
    TreeNode ansRoot = ans;

    public TreeNode increasingBST(TreeNode root) {
        
        inOrder(root);
        return ansRoot.right;
    }

    void inOrder(TreeNode node) {

        if(node == null) {
            return;
        }
        inOrder(node.left);
        ans.right = new TreeNode(node.val);
        ans = ans.right;
        inOrder(node.right);
    }
}
