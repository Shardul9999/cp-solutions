class Solution {
    public double angleClock(int hour, int minutes) {
        double minuteAngle = 6 * minutes;
        double hourAngle = 30 * (hour % 12) + 0.5 * minutes;

        double ans = Math.abs(minuteAngle - hourAngle);
        return Math.min(ans, 360-ans);
    }
}