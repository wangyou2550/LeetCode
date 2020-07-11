package search.backtrace;
/** 
 * @Description: 数独
 * @Author: wangyou
 * @Date: 2020/7/11
 */
public class Problem14 {
    private boolean[][]rowUsed=new boolean[9][10];
    private boolean[][]colUsed=new boolean[9][10];
    private boolean[][]cubeUsed=new boolean[9][10];
    private char[][]board;

    public void solveSudoku(char[][]board){
        this.board=board;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]=='.')continue;
                int num=board[i][j]-'0';
                rowUsed[i][num]=true;
                colUsed[j][num]=true;
                cubeUsed[cubeNum(i,j)][num]=true;
            }
        }
        backtrac(0,0);
    }

    private boolean backtrac(int row, int col) {
        while(row<9&&board[row][col]!='.'){
            row=col==8?row+1:row;
            col=col==8?0:col+1;
        }
        if(row==9){
            return true;
        }
        for (int i = 1; i <=9 ; i++) {
            if(rowUsed[row][i]||colUsed[col][i]||cubeUsed[cubeNum(row,col)][i])continue;
            rowUsed[row][i]=colUsed[col][i]=cubeUsed[cubeNum(row,col)][i]=true;
            board[row][col]=(char)(i+'0');
            if(backtrac(row,col))return true;
            board[row][col]='.';
            rowUsed[row][i]=colUsed[col][i]=cubeUsed[cubeNum(row,col)][i]=false;


        }
        return false;
    }

    private int cubeNum(int i, int j) {
        int r=i/3;
        int c=j/3;
        return r*3+c;
    }
}
