class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        ArrayList<String> ans= new ArrayList<>();
         int minSum = Integer.MAX_VALUE;
        for(int j=0;j<list2.length;j++){
            int sum=0;
            if(map.containsKey(list2[j])){
                sum=j+map.get(list2[j]);
            if(sum<minSum){
                minSum=sum;
                ans.clear();
                ans.add(list2[j]);
            }
            else if(sum==minSum) ans.add(list2[j]);
            } 
        }
        return ans.toArray(new String[ans.size()]);
    }
}