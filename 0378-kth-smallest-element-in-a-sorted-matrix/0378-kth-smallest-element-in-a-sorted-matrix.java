class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] arr = new int[matrix.length * matrix.length];
        int x = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                arr[x] = matrix[i][j];
                x++;
            }
        }
        // for(int i=0; i<arr.length; i++){
        //     if(i == (k-1)){
        //         return arr[i];
        //     }
        // }
        Arrays.sort(arr);
        return arr[k-1];
    }
}