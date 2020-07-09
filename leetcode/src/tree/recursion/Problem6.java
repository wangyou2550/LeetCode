package tree.recursion;
/**
 * @Description: 判断路径和是否等于一个数
 * 节点为空，返回fasle
 * 节点为叶子节点，判断值是否和sum相等
 * 返回左子树是否存在sum-val的路径或右子树是否存在sum-val的路径
 */
public class Problem6 {

    public boolean hashPathSum(TreeNode root,int sum){
        if(root==null)return false;
        if(root.left==null&&root.right==null)return root.val==sum;
        return hashPathSum(root.left,sum-root.val)||hashPathSum(root.right,sum-root.val);
    }
}
