public class MaxValueinTree {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    public static int findMax(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return Math.max(root.data,Math.max(leftMax, rightMax));
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);


        System.out.println("Maximum value in the tree is : " + findMax(root));

    }
}
