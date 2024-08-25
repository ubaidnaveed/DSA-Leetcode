class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();
         HashSet<String> set = new HashSet<>();
        String lowerCaseString = paragraph.toLowerCase().replaceAll("\\W+"," ");
        String[] words = lowerCaseString.split(" ");
        for(String x : words){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(String x : banned){
            set.add(x);
        }
        int count = 0;
        String ans = "";
        for(String x : map.keySet()){
            if(count<map.get(x) && !set.contains(x)){
                count = map.get(x);
                ans = x;
            }
        }
        return ans;
    }
}