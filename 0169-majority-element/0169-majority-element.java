class Solution {
    public int majorityElement(int[] nums) {
        int majority=0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
       
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > (n/2)) {

                majority = entry.getKey();
            }
        }
        return majority;
    }
}