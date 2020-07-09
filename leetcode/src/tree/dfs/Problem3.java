package tree.dfs;

import tree.recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: 中序遍历
 */
public class Problem3 {
    public List<Integer> inorder(TreeNode root){
       List<Integer>res=new ArrayList<>();
       if(root==null)return res;
       Stack<TreeNode>stack=new Stack<>();
       stack.push(root);
       TreeNode p=root;
       while(!stack.isEmpty()&&p!=null){
           while(p.left!=null){
               stack.push(p.left);
               p=p.left;
           }
           p=stack.pop();
           res.add(p.val);
           if(p.right!=null)p=p.right;

       }
       return res;

    }
}
