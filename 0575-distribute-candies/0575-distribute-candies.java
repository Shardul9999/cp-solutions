class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> st = new HashSet<>();

        for(int i=0; i<candyType.length; i++){
            st.add(candyType[i]);
        }

        return Math.min(candyType.length / 2, st.size());
    }
}