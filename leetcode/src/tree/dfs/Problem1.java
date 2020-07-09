package tree.dfs;

import tree.recursion.TreeNode;

public class Problem1 {
    public void preDfs(TreeNode root){
        visit(root);
        preDfs(root.left);
        preDfs(root.right);
    }
    public void inorderDfs(TreeNode root){

        preDfs(root.left);
        visit(root);
        preDfs(root.right);
    }
    public void backDfs(TreeNode root){

        preDfs(root.left);

        preDfs(root.right);
        visit(root);
    }


    private void visit(TreeNode root) {
    }
}
