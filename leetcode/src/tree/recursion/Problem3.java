package tree.recursion;
/**
 * @Description: 两节点的最长路径，求左节点的高度和又节点高度的最大值
 */
public class Problem3 {
    int max=0;
    public int diameterOfBinarryTree(TreeNode root){
        height(root);
        return max;
    }

    private int  height(TreeNode root) {
        if(root==null)return 0;
        int left=height(root.left);
        int right =height(root.right);
        max=Math.max(left+right,max);
        return 1+Math.max(left,right);
    }
}
