public class SearchTree {
    static class TreeNode {
        int data;
        TreeNode l, r;
        TreeNode(int v) {
            data = v;
            l = r = null;
        }
    }
    public static boolean search(TreeNode root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        return search(root.l, key) || search(root.r, key);
    }
    public static int cntleaf(TreeNode root) {
        if (root == null)
            return 0;
        if (root.l == null && root.r == null)
            return 1;
        return cntleaf(root.l) + cntleaf(root.r);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.l = new TreeNode(2);
        root.r = new TreeNode(3);
        root.l.l = new TreeNode(4);
        root.l.r = new TreeNode(5);
        System.out.println("Is 5 present in the tree : " + search(root, 5));
        System.out.println("Number of leaf nodes in the tree is : " + cntleaf(root));
    }
}
