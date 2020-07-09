package tree.dfs;

import tree.recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: 非递归实现前中后遍历
 */
public class Problem4 {
    public List<Integer> pre(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root=stack.pop();
            if(root==null)continue;
            list.add(root.val);
            stack.push(root.right);
            stack.push(root.left);
        }
        return list;
    }

    public List<Integer> pre1(TreeNode root){
        List<Integer> res=new ArrayList<>();
        if(root==null)return res;
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        res.add(root.val);
        while(!stack.isEmpty()){
            while(root.left!=null){

                root=root.left;
                stack.push(root);
                res.add(root.val);

            }
            TreeNode p=stack.pop();
            if(p.right!=null){
                root=p.right;
                stack.push(root);
                res.add(root.val);
            }
        }
        return res;
    }
    public List<Integer> inorder(TreeNode root){
        List<Integer>res=new ArrayList<>();
        if(root==null)return res;
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            while(root.left!=null){
                root=root.left;
                stack.push(root);
            }
            TreeNode p=stack.pop();
            res.add(p.val);
            if(p.right!=null){
                root=p.right;
                stack.push(root);
            }
        }
                return res;
    }
}
