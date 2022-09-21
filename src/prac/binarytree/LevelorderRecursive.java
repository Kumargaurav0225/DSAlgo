package prac.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LevelorderRecursive {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(levelOrder(root));
    }

    static List<List<Integer>> levels = new ArrayList<>();

    private static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }

    private static void helper(TreeNode root, int level) {
        if (levels.size() == level)
            levels.add(new ArrayList<>());

        levels.get(level).add(root.val);

        if (root.getLeft() != null)
            helper(root.getLeft(), level + 1);
        if (root.getRight() != null)
            helper(root.getRight(), level + 1);
    }
}
