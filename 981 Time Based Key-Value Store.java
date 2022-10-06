class TimeMap {
    Map<String, TreeMap<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
       if(!map.containsKey(key)) {
           map.put(key, new TreeMap<>());
       }
        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> treemap = map.get(key);
        if(treemap == null) {
            return "";
        }
        Integer floor = treemap.floorKey(timestamp);
        if(floor == null) {
            return "";
        }
        return treemap.get(floor);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */