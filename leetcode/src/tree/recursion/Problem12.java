package tree.recursion;
/**
 * @Description: 统计左叶子节点的值
 * 左节点是叶子节点，返回左节点的值加上LeftSum（右节点）
 * 左节点不是右子节点，返回leftSum(left)+left(right)
 */
public class Problem12 {
    public int leftSum(TreeNode root){
        if(root==null)return  0;
        int sum=0;
        TreeNode left=root.left;
        TreeNode right=root.right;
        if(left!=null&&left.left==null&&left.right==null)sum+=left.val;
        return sum+leftSum(left)+leftSum(right);

    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            return root.left.val+sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
}
