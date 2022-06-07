package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * Example 2:
 * Input: root = [1,null,2]
 * Output: 2
 */


public class MaximumDepthBinaryTreeSolutionNo104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepthIterative(TreeNode root) {
        if (root == null)
            return 0;

        Deque<TreeNode> stack = new LinkedList<TreeNode>();

        stack.push(root);
        int count = 0;

        while (!stack.isEmpty()) {
            int size = stack.size();
            while (size-- > 0) {
                TreeNode cur = stack.pop();
                if (cur.left != null)
                    stack.addLast(cur.left);
                if (cur.right != null)
                    stack.addLast(cur.right);
            }
            count++;

        }
        return count;

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
