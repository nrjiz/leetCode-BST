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
    static TreeNode bst(int[] nums,int start,int end){
        if(start>end)return null;
        int i;
        TreeNode root=new TreeNode(nums[start]);
        for(i=start;i<=end;i++){
            if(nums[i]>root.val){
                break;
            }
        }
        root.left=bst(nums,start+1,i-1);
        root.right=bst(nums,i,end);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder,0,preorder.length-1);
    }
}
