class Solution {
    public List<String> stringMatching(String[] words) {
        StringBuilder allWords = new StringBuilder();
        Set<String> resultSet = new HashSet<>();
        for(String word : words){
            allWords.append(word).append(" ");
        }
        for (String word : words) {
            if (allWords.indexOf(word) != allWords.lastIndexOf(word)) {
                resultSet.add(word);
            }
        }
        
        return new ArrayList<>(resultSet);
    }
}