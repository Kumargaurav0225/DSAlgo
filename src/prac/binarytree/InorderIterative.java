package prac.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderIterative {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));

        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));

        root.getRight().setLeft(new TreeNode(6));

        System.out.println(inorder(root));
    }

    private static List<Integer> inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        TreeNode curr = root;

        while (curr != null || !stack.empty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.getLeft();
            }
            curr = stack.pop();
            result.add(curr.getVal());
            curr = curr.getRight();
        }
        return result;
    }
}
