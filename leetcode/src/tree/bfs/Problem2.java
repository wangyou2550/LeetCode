package tree.bfs;


import tree.recursion.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem2 {
    public int findBottomLeftValue(TreeNode root){
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        TreeNode p=null;
        while(!queue.isEmpty()){
            p=queue.poll();
            if(p.right!=null)queue.add(p.right);
            if(p.left!=null)queue.add(p.left);
        }
        return p.val;
    }
}
