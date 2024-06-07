class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<nums.length;i++){
           int rem = target - nums[i];
           if(map.containsKey(rem)){
            return new int[]{map.get(rem),i};
    }
            map.put(nums[i],i) ;
         }
       return new int[]{};
    }
    public static void main (String args[]){
        int[] nums = {2, 7, 11, 15};
        int target1 = 9;
        int[] result = twoSum(nums, target1);
        System.out.println("Output: [" + result[0] + ", " + result[1] + " ]");  
    }
}