    class Solution {
        public static int mergesort(int[] nums, int low, int high){
            int count = 0;
            if(low >= high){
                return count;
            }
            int mid = (low + high) / 2;
            count += mergesort(nums, low, mid);
            count += mergesort(nums, mid+1, high);
            count += countPairs(nums, low, mid, high);
            merge(nums,low,mid,high);
            return count;
        }

        public static void merge(int[] nums, int low, int mid, int high){
            int n1 = mid - low + 1;
            int n2 = high - mid;

            int[] arr1 = new int[n1];
            int[] arr2 = new int[n2];

            for(int i=0; i<n1; i++){
                arr1[i] = nums[low + i];
            }

            for(int j=0; j<n2; j++){
                arr2[j] = nums[mid+1+j];
            }

            int i=0;
            int j=0;
            int k = low;

            while(i < n1 && j < n2){
                if(arr1[i] <= arr2[j]){
                    nums[k++] = arr1[i++];
                }
                else{
                    nums[k++] = arr2[j++];
                }
            }

            while(i<n1){
                nums[k++] = arr1[i++];
            }

            while(j<n2){
                nums[k++] = arr2[j++];
            }
        }

        public static int countPairs(int[] nums , int low, int mid, int high){
            int right = mid + 1;
            int count = 0;

            for(int i=low; i<=mid; i++){
                while(right <= high && (long)nums[i] > 2L * nums[right]){
                    right++;
                }
                count += (right - (mid+1));
            }
            return count;
        }
        public int reversePairs(int[] nums) {
            int ans = mergesort(nums,0,nums.length-1);
            return ans;
        }
    }