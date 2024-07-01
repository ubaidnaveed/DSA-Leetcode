class Solution {
    public boolean isHappy(int n) {
       
        HashSet<Integer> set = new HashSet<Integer>();
        while(true){
             int sum=0;
             while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
            if(sum==1){
              return true;
          }
            else if(set.contains(sum)){
                return false;
            }
            else{
                set.add(sum);
                 n=sum;
            }
        
          
        }
       
    }
}