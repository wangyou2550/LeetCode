package meituan;
/**
 * @Description: dfs 遍历图,图用临界矩阵表示
 */
public class DfsTu {

    public void print(int[][]map){
        boolean[]vis=new boolean[map.length];
        for (int i = 0; i < map.length; i++) {
            dfs(map,vis,i);
        }
    }

    private void dfs(int[][] map, boolean[] vis, int i) {
        if(vis[i])return;
        vis[i]=true;
        for (int j = 0; j < map.length; j++) {
            if(map[i][j]==1){
                dfs(map,vis,j);
            }
        }
    }

}
