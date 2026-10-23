class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count = 0;

        for(int i=0; i<temp.length; i++){
            if(temp[i] != heights[i]) count++;
        }
        
        return count;
    }
}