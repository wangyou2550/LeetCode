package tree.bfs;

import tree.recursion.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem1 {
    public List<Double>averageOfLevels(TreeNode root){
        List<Double>res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for (int i = 0; i < size; i++) {
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            res.add((double)sum/size);
        }
        return res;
    }
}
