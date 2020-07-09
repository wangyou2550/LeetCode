package tree.recursion;


/**
 * @Description: 求树的高度,节点为空，反0，不为空，返回1+左右节点高度的最大值
 */
public class Problem1 {
    public int maxDepth(TreeNode root){
        if(root==null)return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}
