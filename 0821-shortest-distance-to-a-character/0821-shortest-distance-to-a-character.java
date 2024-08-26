class Solution {
    public int[] shortestToChar(String s, char c) {
        int left =0;
        int right = s.length();
        int prev=-1;
        int[] ans = new int[right];
        for(int i=0;i<right;i++){
            if(s.charAt(i)==c) prev=i;
            if(prev!=-1) ans[i]=i-prev;
            else ans[i]=Integer.MAX_VALUE;
        }
         prev = -1; 
        for (int i = right - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i; 
            }
            if (prev != -1) {
                ans[i] = Math.min(ans[i], prev - i); 
            }
        }

        return ans;
    }
}