class Solution {
    public int candy(int[] ratings) {
       int[] ans_left = new int[ratings.length];
       ans_left[0] = 1;
       int[] ans_right = new int[ratings.length];
       ans_right[ratings.length-1] = 1;

       for(int i=1; i<ratings.length; i++){
        if(ratings[i-1] < ratings[i]){
            ans_left[i] = ans_left[i-1] + 1; 
        }
        else{
            ans_left[i] = 1;
        }
       } 

       for(int i=ratings.length-2; i>=0; i--){
        if(ratings[i] > ratings[i+1]){
            ans_right[i] = ans_right[i+1] + 1;
        }
        else{
            ans_right[i] = 1;
        }
       }

        int total = 0;
        for(int i=0; i<ans_left.length; i++){
            total += Math.max(ans_left[i], ans_right[i]);
        }   
        return total;
    }
}