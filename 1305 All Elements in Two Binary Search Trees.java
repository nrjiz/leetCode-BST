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
    int root1ListIndex = 0;
    List<Integer> res = new ArrayList();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> root1List = new ArrayList();
        inorder(root1, root1List);
        int root1Size = root1List.size();
        merge(root2, root1List, root1Size);
        while(root1ListIndex < root1Size) {
            res.add(root1List.get(root1ListIndex));
            root1ListIndex++;
        }
        return res;
    }

    private void inorder(TreeNode root1, List<Integer> root1List) {
        if(root1 == null) return;
        inorder(root1.left, root1List);
        root1List.add(root1.val);
        inorder(root1.right, root1List);
    }

    private void merge(TreeNode root2, List<Integer> root1List, int root1Size) {
        if(root2 == null) return;
        merge(root2.left, root1List, root1Size);
        while(root1ListIndex < root1Size && root1List.get(root1ListIndex) < root2.val) {
            res.add(root1List.get(root1ListIndex));
            root1ListIndex++;
        }
        res.add(root2.val);
        merge(root2.right, root1List, root1Size);
    }
}
