package search.dfs;
/** 
 * @Description: 求矩阵中岛屿的数量 
 * @Author: wangyou
 * @Date: 2020/7/9
 */
public class Problem2 {
    private int m,n;
    private int[][]direction={{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslandss(char[][]grid){
        if(grid==null||grid.length==0||grid[0].length==0)return 0;
        m=grid.length;
        n=grid[0].length;
        int res=0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int i, int j) {
        if(i<0||i>=m||j<0||j>=n||grid[i][j]!='1')return;
        grid[i][j]='0';
        for(int[]dir:direction){
            dfs(grid,i+dir[0],j+dir[1]);
        }
    }
}
