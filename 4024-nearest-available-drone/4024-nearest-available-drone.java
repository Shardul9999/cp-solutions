class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min_distance = Integer.MAX_VALUE;
        int idx = -1;
        
        for(int i=0; i<drones.length; i++){
            int distance = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);;
        
            if(distance <= drones[i][2] && distance < min_distance){
                min_distance = distance;
                idx = i;
            }
        }

        return idx;
    }
}