package tree.recursion;
/**
 * @Description: 求二叉树的第二小值
 * 没有理解。。。。
 */
public class Problem15 {
    public int findSecondMinValue(TreeNode root){
        if(root==null)return -1;
        if(root.left==null&&root.right==null)return -1;
        int leftVal=root.left.val;
        int rightVal=root.right.val;
        if(leftVal==root.val)leftVal=findSecondMinValue(root.left);
        if(rightVal==root.val)rightVal=findSecondMinValue(root.right);
        if (leftVal != -1 && rightVal != -1) return Math.min(leftVal, rightVal);
        if (leftVal != -1) return leftVal;
        return rightVal;

    }
}
