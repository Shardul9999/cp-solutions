class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] temp = arr.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> rank = new HashMap<>();
        int currrank = 1;

        for(int num : temp){
            if(!rank.containsKey(num)){
                rank.put(num, currrank++);
            }
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = rank.get(arr[i]);
        }

        return arr;
    }
}