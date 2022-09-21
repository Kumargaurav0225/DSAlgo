package prac.binarytree;

public class PreorderRecursive {
    public static void main(String args[])
    {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.right.left=new TreeNode(40);
        root.right.right=new TreeNode(50);

        preorder(root);
    }

    public static void preorder(TreeNode root){
        if(root!=null){
            System.out.print(root.val +" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
