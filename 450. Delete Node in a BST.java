/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int value;
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

    public TreeNode deleteNode(TreeNode root, int key) {

        if(root==null)return null;
        else if(key>root.val)return root.right = deleteNode(root.right,key);
        else if(key<root.val)return root.left = deleteNode(root.left,key);
        else {
            if(root.left==null&&root.right==null)return null;
            else if(root.left==null)return root.right;
            else if(root.right==null){return root.left;}
            
               TreeNode successor = findInOrderSuccessor(root.right) ;
               root.val = successor.val;
               root.right = deleteNode(root.right,successor.val);
            }
            return root;
        
    }
    private TreeNode findInOrderSuccessor(TreeNode root){
        if(root.left==null) return root;
        else return findInOrderSuccessor(root.left);
    }
}
