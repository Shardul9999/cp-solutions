class Solution {
    public int totalWaviness(int num1, int num2) {
        int start = num1;
        int end = num2;
        int waviness = 0;

        for(int i=start; i <= end; i++){
            int digilen = String.valueOf(i).length();
            if(digilen >= 3){
                int [] temp = new int[digilen];
                int j = 0;
                int currentNum = i; 
                while (currentNum > 0) {
                    temp[j] = currentNum % 10;
                    currentNum = currentNum / 10;
                    j++;
                }

                for(int k=1; k < temp.length-1; k++){
                    if((temp[k] > temp[k-1] && temp[k] > temp[k+1]) ||
                        temp[k] < temp[k-1] && temp[k] < temp[k+1]){
                        waviness++;
                    }
                }
            }
        }
        return waviness;
    }
}