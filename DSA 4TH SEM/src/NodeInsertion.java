import java.util.LinkedList;
import java.util.Queue;
public class NodeInsertion {
    static class TreeNode {
        int data;
        TreeNode l, r;
        TreeNode(int v) {
            data = v;
            l = r = null;
        }
    }
    public static void insData(TreeNode root, int v) {
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
            insData(root.l, v);
        }
    }
    public static void printPO(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printPO(root.l);
            printPO(root.r);
        }
    }
    public static void printIO(TreeNode root) {
        if (root != null) {
            printIO(root.l);
            System.out.print(root.data + " ");
            printIO(root.r);
        }
    }
    public static void insert(TreeNode root, int k){
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode t = queue.poll();
            if(t.l==null){
                t.l = new TreeNode(k);
                break;
            }
            else queue.add(t.l);
            if(t.r==null){
                t.r = new TreeNode(k);
                break;
            }
            else queue.add(t.r);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.l = new TreeNode(20);
        root.r = new TreeNode(30);
        System.out.println("Before Insertion : ");
        printIO(root);
        insData(root,40);
        insData(root, 100);
        System.out.println();
        System.out.println("After Insertion : ");
        printIO(root);
    }
}
