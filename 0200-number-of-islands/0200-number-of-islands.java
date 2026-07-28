class Solution {
    public static int[] x = {-1,1,0,0};
    public static int[] y = {0,0,-1,1};

    public static boolean valid(int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n) return false;
        return true;
    }

    public static void dfs(char[][] grid, int m, int n, int i, int j,                   boolean[][] visited){
        visited[i][j] = true;

        for(int k=0; k<4; k++){
            int row = i + x[k];
            int col = j + y[k];

            if(valid(row,col,m,n) && grid[row][col] == '1' && !visited[row][col]){
                dfs(grid,m,n,row,col,visited);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        int i = 0;
        int j = 0;

        boolean[][] visited = new boolean[m][n];

        for(int x=0; x<m; x++){
            for(int z=0; z<n; z++){
                if(grid[x][z] == '1' && !visited[x][z]){
                    dfs(grid, m, n, x, z, visited);
                    res++;
                }
            }   
        }

        return res;
    }
}