package tree.recursion;
/**
 * @Description: 求值相等得最长路径
 * 第一步：求以左右节点为相同值的最长深度
 * 第二步：当左右节点值等于根节点，路径为left+1，right+1,否则0，0
 * 第三步：比较当前节点的路径与最长路径相比
 * 返回根节点为相同值的最长深度
 *
 */
public class Problem13 {
    int max=0;
    public int longestUnivaluePath(TreeNode root){
          arrowLength(root);
          return max;

    }

    private int arrowLength(TreeNode root) {
        if(root==null)return 0;
        int left=arrowLength(root.left);
        int right=arrowLength(root.right);
        int arrowLeft=0,arrowRight=0;
        if(root.left!=null&&root.val==root.left.val){
            arrowLeft=left+1;
        }
        if(root.right!=null&&root.val==root.right.val){
            arrowRight=right+1;
        }
        max=Math.max(max,arrowLeft+arrowRight);
        return Math.max(arrowLeft,arrowRight);

    }


}
