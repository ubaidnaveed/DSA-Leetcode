class Solution {
    public int findKthPositive(int[] arr, int k) {
         int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midGap = arr[mid] - (mid + 1);  
            if (midGap < k) {
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
        }

        
        return left + k; 
    
    }
}