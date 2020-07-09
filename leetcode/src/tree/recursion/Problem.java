package tree.recursion;
/**
 * @Description: 统计路径和等于一个数的路径数量
 * 路径不一定以root开头，也不一定leaf结尾
 * 总路径等于以root为首节点的路径，加上左子树的总路径，右子树的总路径
 */
public class Problem {
    public int pathSum(TreeNode root ,int sum){
        if(root==null)return 0;
        int ret=pathSumStartRoot(root ,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
        return ret;
    }

    private int pathSumStartRoot(TreeNode root ,int sum) {
        int cnt=0;
        if(root==null)return 0;
        if(root.val==sum)cnt++;
        cnt+=pathSumStartRoot(root.left,sum-root.val)+pathSumStartRoot(root.right,sum-root.val);
        return cnt;

    }

}
