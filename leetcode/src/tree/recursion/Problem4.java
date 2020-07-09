package tree.recursion;
/**
 * @Description: 翻转树 将树的左子树翻转完后，放在右节点，右子树翻转后放在左节点
 */
public class Problem4 {
    public TreeNode reverseTree(TreeNode root){
        if(root==null)return null;
        TreeNode left=root.left;
        root.left=reverseTree(root.right);
        root.right=reverseTree(left);
        return root;
    }
}
