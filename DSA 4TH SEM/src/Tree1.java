public class Tree1 {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return 1 + leftNodes + rightNodes;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Height of the tree is : " + height(root));

        System.out.println("Number of the nodes in the tree is : " + countNodes(root));
    }
}
