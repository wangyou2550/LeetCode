package search.dfs;
/** 
 * @Description: 查找最大的连通面积
 * @Author: wangyou
 * @Date: 2020/7/9
 */
public class Problem1 {
    int m;
    int n;
    int[][]direction={{1,0},{-1,0},{0,1},{0,-1}};
    public int maxArea(int[][]board){
        if(board==null||board.length==0||board[0].length==0)return 0;
        int max=0;
        m=board.length;
        n=board[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n; j++) {
                if(board[i][j]==1){
                    max=Math.max(max,dfs(board,i,j));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] board, int i, int j) {
        int sum=1;
        board[i][j]=0;
        for(int[]dir:direction){
            int x=i+dir[0];
            int y=j+dir[1];
            if(x>=0&&x<m&&y>=0&&y<n&&board[x][y]==1){
                sum+=dfs(board,x,y);

            }
        }
        return sum;
    }
}
