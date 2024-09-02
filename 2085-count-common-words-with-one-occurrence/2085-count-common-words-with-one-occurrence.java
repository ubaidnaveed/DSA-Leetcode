class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String word1 : words1) {
            map1.put(word1, map1.getOrDefault(word1, 0) + 1);
        }

        // Count frequency of words in words2
        for (String word2 : words2) {
            map2.put(word2, map2.getOrDefault(word2, 0) + 1);
        }

        int count = 0;

       
        for (String word : map1.keySet()) {
            if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}