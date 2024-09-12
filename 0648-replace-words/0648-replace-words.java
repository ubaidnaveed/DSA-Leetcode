class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
         StringBuilder result = new StringBuilder();
        for(String word : words){
            String newWord = word;
            for(int i=1;i<=word.length();i++){
                String prefix = word.substring(0,i);
                if(set.contains(prefix)) {
                    newWord = prefix;
                    break;
                }
            }
            if(result.length()>0) result.append(" ");
            result.append(newWord);
        }
        return result.toString();
    }
}