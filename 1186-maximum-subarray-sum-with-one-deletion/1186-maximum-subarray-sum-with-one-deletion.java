class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;

        int nodelete = arr[0];
        int result = arr[0];
        int onedelete = arr[0];

        for(int i=1; i<n; i++){
            int prevnodelete = nodelete;
            
            //for nodelete which is normal kadane algo
            nodelete = Math.max(nodelete + arr[i], arr[i]);

            //onedelete main conceot of this code
            onedelete = Math.max(onedelete + arr[i], prevnodelete);

            result = Math.max(result, Math.max(onedelete, nodelete));
        }

        return result;
    }
}