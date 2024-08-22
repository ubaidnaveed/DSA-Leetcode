class Solution {
    public int mySqrt(int x) {
        int i = 1;
        int j = x;
         if (x == 0) return x;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(mid==(x/mid)) return mid;
            else if(mid>(x/mid)) j=mid - 1;
            else i=mid + 1;
        }
        return j;
    }
}