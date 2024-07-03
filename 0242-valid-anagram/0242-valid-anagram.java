class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
      
        for(int i=0;i<s.length();i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            map.put(ss,map.getOrDefault(ss,0)+1);
            map.put(tt,map.getOrDefault(tt,0)-1);
        }
        for (int i : map.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}