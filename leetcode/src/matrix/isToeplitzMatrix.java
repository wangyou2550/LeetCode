package matrix;

public class isToeplitzMatrix {
    private int m;
    private int n;
    private int[][]matrix;
    public boolean isToeplitzMatrix(int[][]matrix){
        m=matrix.length;
        n=matrix[0].length;
        this.matrix=matrix;
        for (int i = 0; i < m; i++) {
            if(!check(matrix[0][i],0,i))return false;
        }
        for (int i = 1; i <n ; i++) {
            if(!check(matrix[i][0],i,0))return false;
        }
        return true;
    }

    private boolean check(int val, int i, int j) {
        while(i<m&&j<n){
            if(matrix[i++][j++]!=val)return false;
        }
        return true;
    }
}
