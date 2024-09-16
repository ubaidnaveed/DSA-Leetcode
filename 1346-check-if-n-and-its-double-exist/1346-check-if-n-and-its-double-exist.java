class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target = arr[i]*2;
            int min=0;
            int max=arr.length-1;
            while(min<=max){
                int mid = min + (max-min)/2;
                if(arr[mid]==target && mid!=i) return true;
                else if(arr[mid]<target) min=mid+1;
                else max=mid-1;
            }
        }
        return false;
    }
}