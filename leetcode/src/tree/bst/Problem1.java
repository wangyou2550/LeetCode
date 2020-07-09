package tree.bst;

import tree.recursion.TreeNode;

public class Problem1 {
    public TreeNode trimBinary(TreeNode root,int l,int r){
        if(root==null)return null;
        if(root.val>r)return trimBinary(root.left,l,r);
        if(root.val<l)return trimBinary(root.right,l,r);
        root.right=trimBinary(root.left,l,r);
        root.right=trimBinary(root.right,l,r);
        return root;

    }
}
