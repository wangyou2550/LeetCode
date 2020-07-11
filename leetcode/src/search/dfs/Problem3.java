package search.dfs;
/**
 * @Description: 好友关系的联通分量
 * @Author: wangyou
 * @Date: 2020/7/9
 */
//思路：dfs,可以用一个数组来标记某个人是否被访问
public class Problem3 {
    int n;
    public int friendCircleCount(int[][]m){
        if(m==null||m.length==0)return 0;
        n=m.length;
        boolean[]vis=new boolean[n];
        int cnt=0;
        for (int i = 0; i <n ; i++) {
            if(!vis[i]){
                cnt++;
                dfs(m,i,vis);
            }
        }
        return cnt;
    }

    private void dfs(int[][] m, int i, boolean[] vis) {
        vis[i]=true;
        for (int j = 0; j <n ; j++) {
            if(m[i][j]==1&&!vis[j]){
                dfs(m,j,vis);
            }
        }
    }
}
