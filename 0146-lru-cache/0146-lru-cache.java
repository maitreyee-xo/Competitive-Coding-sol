class LRUCache {
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> hm;
    int cache_cap;

    public LRUCache(int capacity) {
        hm = new HashMap(capacity);
        this.cache_cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        int res= -1;
        Node node = hm.get(key);
        if(node != null){
            res = node.val;
            remove(node);
            add(node);
        }
        return res;
    }
    
    public void put(int key, int value) {
        Node node = hm.get(key);
        if(node != null)
        {
            node.val = value;
            remove(node);
            node.val = value;
            add(node);
        }
        else{
            if(hm.size() == cache_cap)
            {
                hm.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            hm.put(key, newNode);
            add(newNode);
        }
    }
    public void add(Node node)
    {
        Node head_next = head.next;
        node.next = head_next;
        head_next.prev = node;
        head.next = node;
        node.prev = head;
    }
    public void remove(Node node)
    {
        Node next_node = node.next;
        Node prev_node = node.prev;
        next_node.prev = prev_node;
        prev_node.next = next_node;
    }
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */