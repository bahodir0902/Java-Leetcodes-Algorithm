class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        root = deleteHelper(root, key);
        return root;
    }
    private TreeNode deleteHelper(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(root.val > key){
            root.left =  deleteHelper(root.left, key);
        }else if(root.val < key){
            root.right = deleteHelper(root.right, key);
        }else if(root.val == key){
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                int data = successor(root.right);
                root.val = data;
                root.right = deleteHelper(root.right, data);
            }
        }else{
            System.out.println("The tree does not contain a node with value " + key + ".");
            return root;
        }
        return root;
    }

    private int successor(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root.val;
    }
}
public class DeleteNodeFromBST {
    static void display(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(3);
        tree.left.left = new TreeNode(2);
        tree.left.right = new TreeNode(4);
        tree.right = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        // TreeNode test = new TreeNode(5);
        // test.left = new TreeNode(2);
        // test.left.right = new TreeNode(4);
        // test.right = new TreeNode(6);
        // test.right = new TreeNode(7);

        display(tree);
        TreeNode result = sol.deleteNode(tree, 3);
        // TreeNode t = sol.deleteNode(test, 0);
        System.out.println();
        display(result);
        System.out.println();
       // display(t);
    }
}
