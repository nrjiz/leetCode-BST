class Solution {
    private int targetValue;

    // Splits a BST into two trees based on the target value; each tree contains either all elements less than or equal to the target
    // or all elements greater than the target, maintaining the BST properties.
    public TreeNode[] splitBST(TreeNode root, int target) {
        targetValue = target;
        return split(root);
    }

    // A recursive helper function that splits the BST.
    private TreeNode[] split(TreeNode node) {
        if (node == null) {
            return new TreeNode[]{null, null};
        }
        if (node.val <= targetValue) {
            // If the current node's value is less than or equal to the target, split the right subtree.
            TreeNode[] splitRight = split(node.right);
            node.right = splitRight[0]; // The left part of the right subtree becomes the right child of the current node.
            splitRight[0] = node; // The current node becomes the rightmost node of the left split tree.
            return splitRight;
        } else {
            // If the current node's value is greater than the target, split the left subtree.
            TreeNode[] splitLeft = split(node.left);
            node.left = splitLeft[1]; // The right part of the left subtree becomes the left child of the current node.
            splitLeft[1] = node; // The current node becomes the leftmost node of the right split tree.
            return splitLeft;
        }
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
