package tree.recursion;
/**
 * @Description: 强盗问题，房屋成二叉树排列
 *
 * 记录值hashmap
 * 用动态规划
 */
public class Problem14 {
    public int rob(TreeNode root){
        if(root==null)return 0;
       int left=root.left!=null?rob(root.left.left)+rob(root.left.right):0;
       int right=root.right!=null?rob(root.right.left)+rob(root.right.right):0;
       return Math.max(root.val+left+right,rob(root.left)+rob(root.right));

    }
}
