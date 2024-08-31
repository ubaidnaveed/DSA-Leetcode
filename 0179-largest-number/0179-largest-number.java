class Solution {
    public String largestNumber(int[] nums) {
        String[] strNum = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strNum[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strNum,new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                String order1 = a+b;
                String order2 = b+a;
                return order2.compareTo(order1);
            }
        });
             if (strNum[0].equals("0")) {
            return "0";
        }
        
       
        StringBuilder largestNumber = new StringBuilder();
        for (String numString : strNum) {
            largestNumber.append(numString);
        }
        
        return largestNumber.toString();
    }
}