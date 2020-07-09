package tree.recursion;
/**
 * @Description: 求树节点到业子节点的最小路径
 */
public class Problem11 {
    public int minDepth(TreeNode root){
        if(root==null)return 0;
        if(root.left!=null&&root.right!=null) {
            return 1+Math.min(minDepth(root.left),minDepth(root.right));

        }
        return 1+Math.max(minDepth(root.left),minDepth(root.right));


    }
}
