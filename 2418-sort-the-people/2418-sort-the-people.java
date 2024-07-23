class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] arr = new String[names.length];
        int reverse=heights.length-1;
        for(int j=0;j<heights.length;j++){
            arr[j]=map.get(heights[reverse]);
            reverse--;
        }
        return arr;
    }
}