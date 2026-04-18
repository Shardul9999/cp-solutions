class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for(int task : tasks){
            freq[task-'A']++;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b-a);
        for(int f : freq){
            if(f > 0){
                heap.offer(f);
            }
        }

        Queue<int[]> cooldown = new LinkedList<>();
        int time = 0;

        while(!heap.isEmpty() || !cooldown.isEmpty()){
            time++;

            if(!cooldown.isEmpty() && cooldown.peek()[1] <= time){
                heap.offer(cooldown.poll()[0]);
            }

            if(!heap.isEmpty()){
                int count = heap.poll() - 1;
                if(count > 0){
                    cooldown.offer(new int[]{count, time + n + 1});
                }
            }
        }
        return time;
    }
}