class Solution {
    int value = 0;
    public TreeNode bstToGst(TreeNode root) {
        bstToGs(root);
        return root;
    }
    void bstToGs(TreeNode root){
        if(root==null)
            return;
        bstToGs(root.right);
        root.val += value;
        value = root.val;
        bstToGs(root.left);
    }
}
