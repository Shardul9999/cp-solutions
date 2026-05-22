class Solution {
    public int trailingZeroes(int n) {
        int zero_count = 0;
        while(n >= 5){
            zero_count += n / 5;
            n /= 5;
        }
        return zero_count;
    }
}