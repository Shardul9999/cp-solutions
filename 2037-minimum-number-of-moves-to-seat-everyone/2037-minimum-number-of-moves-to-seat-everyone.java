class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       Arrays.sort(seats);
       Arrays.sort(students);
       int seats_shift = 0;
       int i = 0;
       int j = 0;

       while(i < seats.length && j < students.length){
        seats_shift += Math.abs(seats[i] - students[i]);
        i++;
        j++;
       }
       return seats_shift;
    }
}