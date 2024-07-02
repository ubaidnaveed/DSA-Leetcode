class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        for(int i=0; i<s.length();i++){
            char original=s.charAt(i);
            char replaceWith=t.charAt(i);
            if(!map.containsKey(original)){
                if(!map.containsValue(replaceWith)){
                    map.put(original,replaceWith);
                }
                else{
                    return false;
                }
            }
            else{
                char x = map.get(original);
                if(x!=replaceWith){
                    return false;
                }
            }
        }
        return true;
    }
}