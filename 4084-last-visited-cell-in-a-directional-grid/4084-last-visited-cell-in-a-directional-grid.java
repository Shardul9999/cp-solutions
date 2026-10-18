class Solution {
    public int[] lastVisitedCell(char[][] grid) {
       int m = grid.length;
       int n = grid[0].length;

       boolean[][] visited = new boolean[m][n];
       int row = 0;
       int col = 0;
       visited[row][col] = true;

       while(true){
            int new_row = row;
            int new_col = col;

            if(grid[row][col] == 'L'){
                new_col--;
            }
            else if(grid[row][col] == 'R'){
                new_col++;
            }
            else if(grid[row][col] == 'U'){
                new_row--;
            }
            else if(grid[row][col] == 'D'){
                new_row++;
            }
            
            if(new_row < 0 || new_row >= m || new_col < 0 || new_col >= n) break;
            if(visited[new_row][new_col]) break;

            row = new_row;
            col = new_col;
            visited[row][col] = true;
       } 
       return new int [] {row,col};
    }
}