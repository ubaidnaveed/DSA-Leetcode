class Solution {
    public int maximumCount(int[] nums) {
        
        int n = nums.length;

        int negPos = binarySearch(nums,0,n-1,0);
        int negCnt = negPos;
        int posPos = binarySearch(nums,0,n-1,1);
        int posCnt = n - posPos;

        return Math.max(posCnt,negCnt);
    }

    private int binarySearch(int[] nums, int left, int right, int t)
    {
        while(left<=right)
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    
}