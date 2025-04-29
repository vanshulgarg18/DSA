public class Level {
    static class TreeNode {
        int data;
        TreeNode l, r;
        TreeNode(int v) {
            data = v;
            l = r = null;
        }
    }
    public static void printLe(TreeNode root, int le) {
        if (root == null)
            return;
        if (le == 1) {
            System.out.print(root.data + " ");
        } 
        else {
            printLe(root.l, le - 1);
            printLe(root.r, le - 1);
        }
    }
    public static void insdata(TreeNode root, int v) {
        if (root == null) {
            root = new TreeNode(v);
        }
        else if (root.l == null) {
            root.l = new TreeNode(v);
        } 
        else if (root.r == null) {
            root.r = new TreeNode(v);
        } 
        else {
            insdata(root.l, v);
            insdata(root.r, v);
        }
    }
    public static void printTr(TreeNode root) {
        if (root == null)
            return;
        printTr(root.l);
        System.out.print(root.data + " ");
        printTr(root.r);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);
        root.l = new TreeNode(50);
        root.r = new TreeNode(150);
        root.l.r = new TreeNode(56);
        insdata(root, 2);
    }
}
