package search.backtrace;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 输出二叉树中所有从根节点到叶子节点的路径
 * @Author: wangyou
 * @Date: 2020/7/9
 */
/*思路:结果返回为List<String>,
递归截至条件,当前节点为叶子节点
递归:左右节点*/
public class Problem4 {
    public List<String> binaryTreePath(TreeNode root){
        List<String>res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        if(root==null)return res;
        backtrace(root,res,sb);
        return res;
    }

    private void backtrace(TreeNode root, List<String> res, StringBuilder sb) {


    }

}
