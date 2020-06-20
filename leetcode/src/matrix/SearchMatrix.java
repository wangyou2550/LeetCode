package matrix;

public class SearchMatrix {
    public static boolean searchMatrix(int[][]matix,int target){
        if(matix==null||matix.length==0&&matix[0].length==0)return false;
        int m=matix.length,n=matix[0].length;
        int row=0,col=n-1;
        while (row<m&&col>=0){
            if(target==matix[row][col])return true;
            else if(target<matix[row][col])col--;
            else row++;
        }
        return false;



    }

    public static void main(String[] args) {
        int[][]matrix={{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(searchMatrix(matrix,11));
    }
}
