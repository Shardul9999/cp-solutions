class Solution {
    public static void helper(int i, int j, int[][] arr){
        //Row fix
        for(int col = 0; col < arr[i].length; col++){
            arr[i][col] = 0;
        }

        //Col fix
        for(int row = 0; row < arr.length; row++){
            arr[row][j] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        List<int[]> lis = new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                   lis.add(new int[] {i,j});
                }
            }
        }

        for(int[] pos : lis){
            helper(pos[0],pos[1],matrix);
        }
    }
}