import java.util.LinkedList;
import java.util.Queue;

public class NodeInsertion {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    public static void insertData(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else if (root.left == null) {
            root.left = new TreeNode(value);
        } else if (root.right == null) {
            root.right = new TreeNode(value);
        } else {
            insertData(root.left, value);
        }
    }

    public static void printPreorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    public static void insert(TreeNode root, int key){
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left==null){
                temp.left = new TreeNode(key);
                break;
            }else queue.add(temp.left);

            if(temp.right==null){
                temp.right = new TreeNode(key);
                break;
            }else queue.add(temp.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); // root node
        // insertData(root, 20);
        // insertData(root, 30);
        // insertData(root, 40);
        // insertData(root, 50);

        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        System.out.println("Before Insertion : ");

        printInorder(root);

        insertData(root,40);
        insertData(root, 100);
        System.out.println();

        System.out.println("After Insertion : ");

        printInorder(root);

        // System.out.println("Preorder Traversal:");
        // printPreorder(root);

        // System.out.println("\nInorder Traversal:");
        // printInorder(root);
    }
}
