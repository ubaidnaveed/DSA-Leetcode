class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int a=str1.length();
        int b=str2.length();
        if((str1+str2).equals((str2+str1))){
            return str2.substring(0,gcd(a,b));   
        }
        return "";
    }
    public int gcd(int a, int b){
        int r=a%b;
        if(r==0) return b;
        return gcd(b,r);
    }
}