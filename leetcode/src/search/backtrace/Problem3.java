package search.backtrace;

import java.net.PortUnreachableException;
import java.util.Scanner;

/**
 * @Description: 矩阵中寻找字符串
 * @Author: wangyou
 * @Date: 2020/7/9
 */
public class Problem3 {
    private final static int[][]direction={{1,0},{-1,0},{0,1},{0,-1}};
    private int m;
    private int n;
    private char[][]board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
    public boolean exist(String word){
        m=board.length;
        n=board[0].length;
        if(word==null||board.length==0)return true;
        boolean[][]vis=new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                if(backTrace(word,0,i,j,vis)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTrace(String word, int index, int i, int j, boolean[][] vis) {
           if(index==word.length())return true;
            if(i<0||i>=m||j<0||j>=n||vis[i][j]||word.charAt(index)!=board[i][j])return false;
            vis[i][j]=true;
            for(int[]dir:direction){
                int x=i+dir[0];
                int y=j+dir[1];
                if(backTrace(word,index+1,x,y,vis))return true;
//                backTrace(word,index+1,x,y,vis);
            }
            vis[i][j]=false;
            return false;
    }

    public static void main(String[] args) {
        Problem3 p=new Problem3();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(p.exist(sc.nextLine()));
        }
    }
}
