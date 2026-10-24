//  Definition for a binary tree node.
package binaryTree;


public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
      public static void main(String[] args) {
    	  TreeNode root = new TreeNode(10);
          root.left = new TreeNode(4);
          root.right = new TreeNode(6);

          Solution sol = new Solution();
          boolean result = sol.checkTree(root);

          System.out.println("Result: " + result); 
		
	}
  }
 
class Solution {
    public boolean checkTree(TreeNode root) {
       return root.val==root.left.val+root.right.val;
    }
}

// leetcode quetion no 2236