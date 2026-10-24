class Solution {
    public int dayNumber(String date, int[] arr) {
        String[] temp = date.split("-");

        int month = Integer.parseInt(temp[0]);
        int day = Integer.parseInt(temp[1]);

        int total = day;

        for (int i = 0; i < month - 1; i++) {
            total += arr[i];
        }

        return total;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int [] Month = new int[12];
        Month[0] = 31;
        Month[1] = 28;
        Month[2] = 31;
        Month[3] = 30;
        Month[4] = 31;
        Month[5] = 30;
        Month[6] = 31;
        Month[7] = 31;
        Month[8] = 30;
        Month[9] = 31;
        Month[10] = 30;
        Month[11] = 31;

        int aliceStart = dayNumber(arriveAlice, Month);
        int aliceEnd = dayNumber(leaveAlice, Month);

        int bobStart = dayNumber(arriveBob, Month);
        int bobEnd = dayNumber(leaveBob, Month);

        int overlapStart = Math.max(aliceStart, bobStart);
        int overlapEnd   = Math.min(aliceEnd, bobEnd);

        int overlapDays = Math.max(0, overlapEnd - overlapStart + 1);

        return overlapDays;

    }
}