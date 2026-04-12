class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int left = 0;
        int right = 0;
        int count = 0;

        while(right < s.length && left < g.length){
            if(s[right] >= g[left]){
                count++;
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        return count;
    }
}