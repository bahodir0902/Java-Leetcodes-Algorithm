import java.util.ArrayList;
import java.util.HashMap;

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
    // List<Integer> lst = new ArrayList();
    HashMap<Integer, Integer> map = new HashMap<>();
    public void add_lst(TreeNode root){
        if(root == null){
            return;
        }
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        add_lst(root.left);
        add_lst(root.right);
    }
    public int[] findMode(TreeNode root) {
        add_lst(root);
        System.out.println(map);
        int max = 1;
        for(int i : map.values()){
            if(i > max){
                max = i;
            }
        }
        ArrayList<Integer> lst = new ArrayList<>(); 
        for(int key : map.keySet()){
            if(map.get(key) == max){
                lst.add(key);
            }
        }
        int[] arr = new int[lst.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lst.get(i);
        }
        return arr;
    } 
}
public class FindModeInBST {
    static void display(TreeNode node){
        System.out.print(node.val + " ");
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.right.left = new TreeNode(2);
        tree.right.left.right = new TreeNode(2);
        
        int[] arr =  sol.findMode(tree);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
