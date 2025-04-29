import java.util.LinkedList;
import java.util.Queue;

public class NodeInsertion {

    static class TreeNode {
        int data;
        TreeNode l, r;

        TreeNode(int val) {
            data = val;
            l = r = null;
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
        }
    }
    public static void printPreorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printPreorder(root.l);
            printPreorder(root.r);
        }
    }
    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.l);
            System.out.print(root.data + " ");
            printInorder(root.r);
        }
    }
    public static void insert(TreeNode root, int key){
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.l==null){
                temp.l = new TreeNode(key);
                break;
            }
            else queue.add(temp.l);
            if(temp.r==null){
                temp.r = new TreeNode(key);
                break;
            }
            else queue.add(temp.r);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.l = new TreeNode(20);
        root.r = new TreeNode(30);
        System.out.println("Before Insertion : ");
        printInorder(root);
        insertData(root,40);
        insertData(root, 100);
        System.out.println();
        System.out.println("After Insertion : ");
        printInorder(root);
    }
}
