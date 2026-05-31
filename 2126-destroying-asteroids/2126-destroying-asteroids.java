class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long new_mass = mass;

        for(int i=0; i<asteroids.length; i++){
            if(asteroids[i] <= new_mass){
                new_mass += asteroids[i];
            }
            else{
                return false;
            }
        }
        return true;
    }    
}                                                                                   
