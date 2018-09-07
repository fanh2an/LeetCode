public class MaxDepthOfBinaryTree_104 {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return 1;
        else
        {
            int maxDepth =1+Math.max(maxDepth(root.left),maxDepth(root.right));
            return maxDepth;
        }

    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        {
            val = x;
        }
    }
}
