package matrix;

public class matriReshape {
    public static int[][]matrixReshape(int[][]nums,int r,int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c) return nums;
        int[][] reshapeNums = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshapeNums[i][j] = nums[index / n][index % n];
                index++;

            }

        }
        return reshapeNums;

    }

    public static void main(String[] args) {
        int[][]nums={{1,2,3},{2,5,7},{9,0,11},{34,22,3}};
        int[][] reshape=matrixReshape(nums,3,4);
        for (int[] ints : reshape) {
            for (int anInt : ints) {
                System.out.print(anInt+"---");
            }
            System.out.println();

        }
    }
}
