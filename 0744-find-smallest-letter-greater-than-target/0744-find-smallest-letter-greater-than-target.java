class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]) return letters[0];
        int min = 0;
        int max = letters.length-1;
        while(min<=max){
            int mid = min + (max-min)/2;
            if(letters[mid]<=target) min=mid+1;
            else max=mid-1;
        }
        return letters[min];
    }
}