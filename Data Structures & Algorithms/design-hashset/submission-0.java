class MyHashSet {
    int[] buffer = new int[1000000];
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(buffer[key]==1){
            return;
        }
        buffer[key]=1;
        return;
    }
    
    public void remove(int key) {
        if(buffer[key]==1){
            buffer[key]=0;
        }
        return;
    }
    
    public boolean contains(int key) {
        return buffer[key]==1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */