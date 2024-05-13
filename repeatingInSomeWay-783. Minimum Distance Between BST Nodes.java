class Solution{
  int prev = Integer.MAX_VALUE;
  int ans =Integer.MAX_VALUE;

public int minDifference(){
   helper(overallRoot);
  return ans;
}
  public void helper(node root){

    if (root==null)return;
    helper(root.left);
    ans = Math.min(ans, root.val-prev);
    prev=root.val;
    helper(root.right);
  }
}
  
    
