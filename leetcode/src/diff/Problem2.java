package diff;
/** 
 * @Description: 给定一个数字 n，要求生成所有值为 1...n 的二叉搜索树。
 * @Author: wangyou
 * @Date: 2020/7/11
 */
//思路:分治法
//第一步:遍历1-n
//根节点为root(i);
// 从左边部分挑选出左子树,右边部分挑选出右子树


import Common.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public List<TreeNode> generateTree(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return generateTree1(1, n);


    }
    private List<TreeNode> generateTree1(int start, int end) {
        List<TreeNode>res=new ArrayList<>();
        for (int i = start; i <=end ; i++) {
            TreeNode root=new TreeNode(i);
            List<TreeNode>left=generateTree1(start,i-1);
            List<TreeNode>right=generateTree1(i+1,end);
            for(TreeNode l:left){
                for(TreeNode r:right){
                    root.left=l;
                    root.right=r;
                    res.add(root);

                }
            }
        }
        if(res.size()==0){
            res.add(null);
        }
        return res;
    }
}
