package tree.recursion;
/**
 * @Description: 判断一个树是否是另外一棵树的子树
 * 根节点值相等，判断左子树是否相等，右子树是相等
 * 根节点值不相等，判断该树是左子树的子树还是右子树的子树
 */
public class Problem9 {
    public boolean isSubTree(TreeNode s ,TreeNode t){
        if(t==null)return true;
        if(s==null&&t!=null)return false;
        return isSame(s,t)||isSubTree(s.left,t)||isSubTree(s.right,t);
    }

    private boolean isSame(TreeNode s, TreeNode t) {
        if(s==null&&t==null)return true;
        if(s==null||t==null)return false;
        return s.val==t.val&&isSame(s.left,t.left)&&isSame(s.right,t.right);
    }
}
