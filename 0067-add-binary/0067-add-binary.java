class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1, j=b.length()-1, c=0;
        StringBuilder ans = new StringBuilder();
        while(i>=0 || j>=0){
            int sum = c;
            if(i>=0) sum+=a.charAt(i--) - '0';
            if(j>=0) sum+=b.charAt(j--) - '0';
            ans.append(sum%2);
            c=sum/2;
        }
        if(c!=0) ans.append(c);
        return ans.reverse().toString();
    }
}