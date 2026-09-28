class Solution {
    public boolean RowWise(char[][] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){           
            HashMap<Character, Integer> mp = new HashMap<>();
            for(int j=0; j<n; j++){
                if(arr[i][j] != '.'){
                    int count = mp.getOrDefault(arr[i][j], 0) + 1;
                    mp.put(arr[i][j] , count);

                    if(count > 1) return false;
                }
            }
        }
        return true;
    }

    public boolean ColumnWise(char[][] arr){
        int n = arr.length;
        for(int j=0; j<n; j++){           
            HashMap<Character, Integer> mp = new HashMap<>();
            for(int i=0; i<n; i++){
                if(arr[i][j] != '.'){
                    int count = mp.getOrDefault(arr[i][j], 0) + 1;
                    mp.put(arr[i][j] , count);

                    if(count > 1) return false;
                }
            }
        }
        return true;
    }
    public boolean Fun(char [][] arr){
        int n = arr.length;
        for (int blockRow = 0; blockRow < n; blockRow += 3) {
            for (int blockCol = 0; blockCol < n; blockCol += 3) {
                HashMap<Character, Integer> mp = new HashMap<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char val = arr[blockRow + i][blockCol + j];
                        if (val != '.') {
                            int count = mp.getOrDefault(val, 0) + 1;
                            mp.put(val, count);
                            if (count > 1) return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return RowWise(board) && ColumnWise(board) && Fun(board);
    }
}