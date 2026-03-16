import java.util.*;

class Solution {

    public int numIslands(char[][] grid){

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visit = new boolean[n][m];

        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(grid[i][j]=='1' && !visit[i][j]){
                    bfs(grid,visit,i,j);
                    count++;
                }

            }
        }

        return count;
    }

    public void bfs(char[][] grid, boolean[][] visit, int r, int c){

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});

        visit[r][c] = true;

        int n = grid.length;
        int m = grid[0].length;

        int[] dr = {1,-1,0,0};
        int[] dc = {0,0,1,-1};

        while(!q.isEmpty()){

            int[] node = q.poll();
            int row = node[0];
            int col = node[1];

            for(int k=0;k<4;k++){

                int nrow = row + dr[k];
                int ncol = col + dc[k];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                   grid[nrow][ncol]=='1' && !visit[nrow][ncol]){

                    visit[nrow][ncol] = true;
                    q.add(new int[]{nrow,ncol});

                }

            }

        }
    }
}