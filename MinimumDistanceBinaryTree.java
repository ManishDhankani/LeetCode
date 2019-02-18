//https://leetcode.com/problems/minimum-distance-between-bst-nodes/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Integer diff = Integer.MAX_VALUE;
    Integer prev = null;
    public int minDiffInBST(TreeNode root) {
        if(root.left != null)
             minDiffInBST(root.left);
        if(prev != null)
            diff = Math.min(diff, root.val - prev);
        prev = root.val;
        if(root.right != null)
            minDiffInBST(root.right);
        return diff;
    }
}