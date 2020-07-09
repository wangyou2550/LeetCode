package tree.recursion;
/**
 * @Description: 判断一棵树是否是平衡树
 * 根据求树高的函数改变，平衡树，左右子树的高度小于等于1，关键是定义了一个全局
 * 变量，将是否平衡树的值传回去了
 */
public class Problem2 {
    private boolean isBal=true;
    public boolean isBalance(TreeNode root){
        height(root);
        return isBal;

    }

    private int  height(TreeNode root) {
        if(root==null)return 0;
        int left=height(root.left);
        int right=height(root.right);
        if(Math.abs(left-right)>1)isBal=false;
        return 1+Math.max(left,right);
    }
}
