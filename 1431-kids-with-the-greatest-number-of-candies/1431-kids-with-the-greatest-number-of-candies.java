class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest=0;
        List<Boolean> result = new ArrayList<>();
        for(int candy : candies){
            if(candy>largest) largest = candy;
        }
        for(int candy : candies){
            result.add(candy+extraCandies>=largest);
        }
        return result;
    }
}