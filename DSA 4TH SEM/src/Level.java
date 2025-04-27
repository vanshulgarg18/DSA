public class Level {

    static class TreeNode {
        int data;

        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    public static void printLevel(TreeNode root, int level) {
        if (root == null)
            return;

        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }

    }

    public static void insertData(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
        }

        else if (root.left == null) {
            root.left = new TreeNode(value);
        } else if (root.right == null) {
            root.right = new TreeNode(value);
        } else {
            insertData(root.left, value);
            insertData(root.right, value);
        }

    }

    public static void printTree(TreeNode root) {
        if (root == null)
            return;
        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);
        root.left = new TreeNode(50);
        root.right = new TreeNode(150);

        root.left.right = new TreeNode(56);

        insertData(root, 2);
        // System.out.println(root);
    }

}
