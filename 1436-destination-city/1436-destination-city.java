class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> path : paths){
            map.put(path.get(0),path.get(1));
        }
        String x = paths.get(0).get(0);
        while(map.get(x)!=null){
            x=map.get(x);
        }
        return x;
    }
}