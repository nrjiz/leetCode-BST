class Solution {
    
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return helper(root);
    }
    
    public boolean helper(TreeNode root) {
        if (root == null) 
            return true;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && helper(root.left) && helper(root.right);
    }
    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
