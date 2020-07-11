package search.dfs;
/** 
 * @Description:  填充封闭区域
 * @Author: wangyou
 * @Date: 2020/7/9
 */
//思路：与边界相连的用dfs将之置为'*'，然后将xo变为x,*变为o
public class Problem4 {
    int m,n;
    int[][]direction={{1,0},{-1,0},{0,1},{0,-1}};
    public void solve(char[][]board){
        if(board==null||board.length==0||board[0].length==0)return;
        m=board.length;
        n=board[0].length;
        for (int i = 0; i <n ; i++) {
            dfs(board,0,i);
            dfs(board,m-1,i);
        }
        for (int i = 1; i <m-1 ; i++) {
            dfs(board,i,0);
            dfs(board,i,n-1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                if(board[i][j]=='*')board[i][j]='O';
                else
                    board[i][j]='X';
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        if(i<0||i>=m||j<0||j>=n||board[i][j]!='O')return;
        board[i][j]='*';
       for(int[]dir:direction){
           dfs(board,i+dir[0],j+dir[1]);
       }

    }
}
