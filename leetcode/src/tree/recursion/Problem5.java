package tree.recursion;
/**
 * @Description: 归并两颗树，
 * 1：当前节点都不为空，新节点的值为两个节点的和，左子树为两个节点左子树的归并，
 * 右子树为两个节点右子树的归并
 * 2：当前节点一个为空，返回不为空的树
 * 3：都为空，返回null
 */
public class Problem5 {
    public TreeNode merge(TreeNode t1,TreeNode t2){
        if(t1!=null&&t2!=null){
            t1.val+=t2.val;
            t1.left=merge(t1.left,t2.left);
            t1.right=merge(t1.right,t2.right);
        }else if(t1!=null||t2!=null){
            t1=t1!=null?t1:t2;
        }
        return t1;

    }
}
