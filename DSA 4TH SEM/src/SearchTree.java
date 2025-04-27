public class SearchTree {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    public static boolean search(TreeNode root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;

        return search(root.left, key) || search(root.right, key);
    }

    public static int countLeaf(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeaf(root.left) + countLeaf(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Is 5 present in the tree : " + search(root, 5));
        System.out.println("Number of leaf nodes in the tree is : " + countLeaf(root));
    }
}