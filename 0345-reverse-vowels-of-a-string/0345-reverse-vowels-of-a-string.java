class Solution {
    
    public Boolean isVowel(char x){
    if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' ||x == 'E' || x     == 'I' || x == 'O' || x == 'U') return true;
    return false;
        }
    
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char[] arr= s.toCharArray();
        
        while(l<r){
            if(isVowel(arr[l]) && isVowel(arr[r])){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            else if(isVowel(arr[l])) r--;
            else l++;
        }
        return new String(arr);
    }
}