package tree.bst;

import tree.recursion.TreeNode;

public class Problem2 {
    int cnt=0;
    int val=0;
    public int smallestKth(TreeNode root,int k){
//       inorder(root,k);
//       return val;

        int co=count(root.left)+1;
       if(k==co)return root.val;
       if(k<co)return smallestKth(root.left,k);
     return smallestKth(root.right,k-count(root)-1);

    }

    private void inorder(TreeNode root, int k) {
        if(root==null)return;
        inorder(root.left,k);
        cnt++;
        if(cnt==k){
            val=root.val;
            return;
        }
        inorder(root.right,k);
    }
    private int count(TreeNode root){
        if(root==null)return 0;
        return 1+count(root.left)+count(root.right);
    }
}
