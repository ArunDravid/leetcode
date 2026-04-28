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
    public List<Integer> preorderTraversal(TreeNode root) {
        return preorderTraversal(root,new ArrayList<>());
    }
    private List<Integer> preorderTraversal(TreeNode node, List<Integer> list)
    {
        if (node==null)
        return list;
        list.add(node.val);
        preorderTraversal(node.left,list);
        preorderTraversal(node.right,list);
        return list;
    }
}