class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       Arrays.sort(seats);
       Arrays.sort(students);
       int seats_shift = 0;

       for(int i=0; i<students.length; i++){
        while(students[i] != seats[i]){
            if(students[i] > seats[i]){
                students[i]--;
                seats_shift++;
            }
            else if(students[i] < seats[i]){
                students[i]++;
                seats_shift++;
            }
        }
       } 
       return seats_shift;
    }
}