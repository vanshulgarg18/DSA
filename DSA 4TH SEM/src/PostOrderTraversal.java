public class PostOrderTraversal {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    public static void PostOrder(TreeNode root){
        if (root==null) return ;

        PostOrder(root.left);
        PostOrder(root.right);

        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PostOrder(root);
    }
}
