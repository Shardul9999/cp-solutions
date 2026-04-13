class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if(flowerbed[0] == 0 && n == 1) return true;
            return n == 0;
        }

        for(int i=0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                if(i == 0 && flowerbed[i+1] != 1){
                    flowerbed[i] = 1;
                    n--;
                }
                else if(i == flowerbed.length - 1 && flowerbed[i-1] != 1){
                    flowerbed[i] = 1;
                    n--;
                }
                else if (i > 0 && i < flowerbed.length - 1 && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }
}