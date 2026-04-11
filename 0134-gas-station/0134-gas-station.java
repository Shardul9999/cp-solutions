class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost){
        int totalgas = 0;
        int totalcost = 0;

        for(int i=0; i<gas.length; i++){
            totalgas += gas[i];
        }
        
        for(int i=0; i<cost.length; i++){
            totalcost += cost[i];
        }

        if(totalgas < totalcost) return -1;
        int start = 0;
        int currGas = 0;

        for(int i=0; i<gas.length; i++){
            currGas += gas[i] - cost[i];

            if(currGas < 0){
                start = i + 1;
                currGas = 0;
            }
        }
        return start;
    }
}