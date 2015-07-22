package com.ds.problems;
/**
 * 
 * Find the depth of a given tree.
 *
 */
public class DepthOfTree {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(10);
		TreeNode t2 = new TreeNode(10);
		TreeNode t3 = new TreeNode(10);
		TreeNode t4 = new TreeNode(10);
		TreeNode t5 = new TreeNode(10);
		
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t4.right = t5;
		
		SolutionDepth sd = new SolutionDepth();
		System.out.println(sd.maxDepth(t1));
	}

}


  //Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
class SolutionDepth {
    public int maxDepth(TreeNode root) {
        if(root == null){
        	return 0;
        }
        int levelL, levelR;
        levelL = maxDepth(root.left);
        
        levelR = maxDepth(root.right);
        
        return (levelL>levelR)? (levelL+1): (levelR+1);
    }
}
