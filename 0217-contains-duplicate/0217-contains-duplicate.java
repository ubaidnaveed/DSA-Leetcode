// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<nums.length;i++){
//             if(!set.contains(nums[i])){
//                 set.add(nums[i]);
//             }else{
//                 return true;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
               return true;
            }
        }
        return false;
    }
}