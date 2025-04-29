public class Tree1 {
    static class TreeNode {
        int data;
        TreeNode l, r;
        TreeNode(int v) {
            data = v;
            l = r = null;
        }
    }
    public static int height(TreeNode root) {
        if (root == null)
            return 0;
        int lefthe = height(root.l);
        int righthe = height(root.r);
        return Math.max(lefthe, righthe) + 1;
    }
    public static int cntnodes(TreeNode root) {
        if (root == null)
            return 0;
        int leftN = cntnodes(root.l);
        int rightN = cntnodes(root.r);
        return 1 + leftN + rightN;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.l = new TreeNode(2);
        root.r = new TreeNode(3);
        root.l.l = new TreeNode(4);
        root.l.r = new TreeNode(5);
        System.out.println(height(root));
        System.out.println(cntnodes(root));
    }
}
