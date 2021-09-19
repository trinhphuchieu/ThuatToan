// way 1 tự giải
class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root != null)
        {   
            if(root.val <= high && root.val >= low) sum += root.val;  
            rangeSumBST(root.left,low,high);
            rangeSumBST(root.right,low,high);    
        }   
        return sum;
    }
}
// way 2 tham khảo
class Solution {

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if(root == null){ return 0;}
          
  
        if(root.val < low) return rangeSumBST(root.right,low,high);
        if(root.val > high) return rangeSumBST(root.left,low,high);    
         
        return root.val + rangeSumBST(root.right,low,high)  + rangeSumBST(root.left,low,high);
    }
}
//way 3 stack Stack<TreeNode> stk = new Stack<>();