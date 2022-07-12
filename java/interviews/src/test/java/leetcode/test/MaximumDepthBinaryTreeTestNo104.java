package leetcode.test;

import leetcode.MaximumDepthBinaryTreeSolutionNo104;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static leetcode.MaximumDepthBinaryTreeSolutionNo104.*;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumDepthBinaryTreeTestNo104 {

    private MaximumDepthBinaryTreeSolutionNo104 solution = null;

    @BeforeEach
    public void setUp() {
        solution = new MaximumDepthBinaryTreeSolutionNo104();
    }

    @Test
    @DisplayName("test maxim depth binary tree")
    public void testFor3() {

        TreeNode seven = new TreeNode(7);
        TreeNode fifteen = new TreeNode(15);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode nine = new TreeNode(9);
        TreeNode root = new TreeNode(3, nine, twenty);

        assertEquals(3, solution.maxDepth(root));
    }


    @Test
    @DisplayName("test maxim depth binary tree with iterations")
    public void testFor3Iterations() {

        TreeNode seven = new TreeNode(7);
        TreeNode fifteen = new TreeNode(15);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode nine = new TreeNode(9);
        TreeNode root = new TreeNode(3, nine, twenty);

        assertEquals(3, solution.maxDepthIterative(root));
    }

}
