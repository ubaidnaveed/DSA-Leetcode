class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main (String args[]){
        int[] nums = {2, 7, 11, 15};
        int target1 = 9;
        int[] result = twoSum(nums, target1);
        System.out.println("Output: [" + result[0] + ", " + result[1] + " ]");  
    }
}