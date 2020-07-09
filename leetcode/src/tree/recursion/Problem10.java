package tree.recursion;

public class Problem10 {
    public boolean isSymmtric(TreeNode root){
        if(root==null)return true;
        return isSummtric(root.left,root.right);

    }
    public  boolean isSummtric(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null)return true;
        if(t1==null||t2==null)return false;
        return t1.val==t2.val&&isSummtric(t1.right,t2.left)&&isSummtric(t1.left,t2.right);
    }

}
