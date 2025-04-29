public class Level {
    static class TreeNode {
        int data;
        TreeNode l, r;
        TreeNode(int val) {
            data = val;
            l = r = null;
        }
    }
    public static void printLevel(TreeNode root, int level) {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.data + " ");
        } 
        else {
            printLevel(root.l, level - 1);
            printLevel(root.r, level - 1);
        }
    }
    public static void insertData(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
        }
        else if (root.l == null) {
            root.l = new TreeNode(value);
        } 
        else if (root.r == null) {
            root.r = new TreeNode(value);
        } 
        else {
            insertData(root.l, value);
            insertData(root.r, value);
        }
    }
    public static void printTree(TreeNode root) {
        if (root == null)
            return;
        printTree(root.l);
        System.out.print(root.data + " ");
        printTree(root.r);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);
        root.l = new TreeNode(50);
        root.r = new TreeNode(150);
        root.l.r = new TreeNode(56);
        insertData(root, 2);
    }
}
