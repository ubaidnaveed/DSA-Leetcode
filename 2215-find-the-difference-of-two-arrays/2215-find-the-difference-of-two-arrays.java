class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for( int n : nums1 ){
        set1.add(n);
    }
    
    for( int n : nums2 ){
        set2.add(n);
    }
    
    Set<Integer> temp = new HashSet<>(set1);
    
    set1.removeAll(set2);
    set2.removeAll(temp);
    
    return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2) );
    }
}