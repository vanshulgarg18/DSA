public class PostOrderTraversal {
    static class TreeNode {
        int data;
        TreeNode l, r;
        TreeNode(int v) {
            data = v;
            l = r = null;
        }
    }
    public static void postorder(TreeNode root){
        if (root==null) return ;
        postorder(root.l);
        postorder(root.r);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.l = new TreeNode(2);
        root.r = new TreeNode(3);
        root.l.l = new TreeNode(4);
        root.l.r = new TreeNode(5);
        postorder(root);
    }
}
