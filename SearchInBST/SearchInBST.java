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
    public TreeNode search(TreeNode root, int val){
        if(root == null){
            return root;
        }
        else if(root.val > val){
            return searchBST(root.left, val);
        }else if(root.val < val){
            return searchBST(root.right, val);
        }else{
            return root;
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        root = search(root, val);
        return root;
    }
}
public class SearchInBST {
    static void display(TreeNode tree){
        if(tree == null){
            return;
        }
        System.out.print(tree.val + " ");
        display(tree.left);
        display(tree.right);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right = new TreeNode(7);

        TreeNode result = sol.searchBST(tree, 2);
        display(result);
    }   
}
