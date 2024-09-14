class Solution {
    public boolean isPerfectSquare(int num) {
        int min = 0;
        int max = num;
        while(min<=max){
            int mid=min+(max-min)/2;
            long ans =(long) mid * mid;
            if(ans==num) return true;
            if(ans<num){
                min=mid+1;
            }
            else  max=mid-1;
        }
        return false;
    }
}