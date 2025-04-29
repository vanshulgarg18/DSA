public class MaxValueinTree {
    static class TreeNode {
        int data;
        TreeNode l, r;
        TreeNode(int v) {
            data = v;
            l = r = null;
        }
    }
    public static int fmax(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int leftm = fmax(root.l);
        int rightm = fmax(root.r);
        return Math.max(root.data,Math.max(leftm, rightm));
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.l = new TreeNode(20);
        root.r = new TreeNode(30);
        root.l.l = new TreeNode(40);
        root.l.r = new TreeNode(50);
        System.out.println(fmax(root));
    }
}
