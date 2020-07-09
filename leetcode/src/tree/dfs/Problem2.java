package tree.dfs;

import tree.recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * @Description: 前序遍历
 *
 */
public class Problem2 {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer>res=new ArrayList<>();

        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
          TreeNode p=stack.pop();
          if(p==null)continue;
          res.add(p.val);
          stack.push(p.right);
          stack.push(p.left);
        }
        return res;
    }
}
