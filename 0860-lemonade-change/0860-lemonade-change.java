class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        int twentys = 0;

        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5) fives++;
            else if(bills[i] == 10){
                if(fives >= 1){
                    tens++;
                    fives--;
                }
                else{
                    return false;
                }
            }
            else if(bills[i] == 20){
                if(tens >=1 && fives >= 1){
                    //twentys++;
                    tens--;
                    fives--;
                }
                else if(fives >= 3){
                    fives -= 3;
                    //twentys++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}