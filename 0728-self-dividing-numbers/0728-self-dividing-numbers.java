class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            
            if(check(i)==true){
                list.add(i);
            }
            }
        return list;
        }
    public boolean check(int n){
        int d =n;
        while(d!=0){
            int tempd= d%10;
            if(tempd==0 || n%tempd !=0 ) return false;
            d/=10;
        }
        return true;
    }
    }
