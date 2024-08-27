class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email : emails){
            String[] parts=email.split("@");
            String[] temp=parts[0].split("\\+");
            set.add(temp[0].replace(".","")+"@"+parts[1]);
        }
        return set.size();
    }
}