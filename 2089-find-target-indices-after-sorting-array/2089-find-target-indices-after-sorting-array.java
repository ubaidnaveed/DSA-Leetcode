class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        int FirstOccurence= firstOccurence(nums,target);
         if (FirstOccurence == -1) {
            return new ArrayList<>(); // Target not found
        }
        int LastOccurence= lastOccurence(nums,target);
            for(int i=FirstOccurence;i<=LastOccurence;i++){
                ans.add(i);
            }
        return ans;
        }
    public int firstOccurence(int[] nums, int target){
        int i=0, j=nums.length-1, first=-1;
        while(i<=j){
            int mid= i+(j-i)/2;
            if(nums[mid]==target){
                first = mid;
                j=mid-1;
            }
            else if(nums[mid]<target) i=mid+1;
            else j=mid-1;
        }
        return first;
    }
    public int lastOccurence(int[] nums, int target){
        int i=0, j=nums.length-1, last=-1;
        while(i<=j){
            int mid= i+(j-i)/2;
            if(nums[mid]==target){
                last = mid;
                i=mid+1;
            }
            else if(nums[mid]<target) i=mid+1;
            else j=mid-1;
        }
        return last;
    }
    }
