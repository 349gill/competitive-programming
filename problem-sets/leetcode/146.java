import java.util.HashMap;
  
class LRUNode { 
    LRUNode prev;
    LRUNode next;
    int key;
    int value;

    public LRUNode(int key, int value) { 
        this.prev = null;
        this.next = null; 
        this.key = key;
        this.value = value;
    } 
} 
  
class LRUDLL {   
    LRUNode head;
    LRUNode tail;

    public LRUDLL() {
        this.head = null;
        this.tail = null;
    }
  
    public void insertAtEnd(LRUNode node) { 
        if (tail == null) { 
            node.prev = null;
            node.next = null;
            head = node; 
            tail = node; 
        } 
        else { 
            tail.next = node; 
            node.prev = tail; 
            tail = node; 
            node.next = null;
        } 
    } 
  
    public void deleteAtBeginning() { 
        if (head == null) { 
            return; 
        } 
  
        if (head == tail) { 
            head = null; 
            tail = null; 
            return; 
        } 
        head.next.prev = null;
        head = head.next;
    }

    public void deleteNodePointer(LRUNode node) {
        if (node.next == null && node.prev == null) {
            head = null;
            tail = null;

            node.next = null;
            node.prev = null;
        }
        else if (node.next == null && node.prev != null) {
            tail = node.prev;
            node.prev.next = null;

            node.next = null;
            node.prev = null;
        }
        else if (node.next != null && node.prev == null) {
            head = node.next;
            node.next.prev = null;

            node.next = null;
            node.prev = null;
        }
        else {
            node.prev.next = node.next;
            node.next.prev = node.prev;

            node.next = null;
            node.prev = null;
        }
    }
}

class LRUCache {
    int cap;
    HashMap<Integer, LRUNode> map;
    LRUDLL memory;
  
    public LRUCache (int cap) {
        this.cap = cap;
        this.map = new HashMap<Integer, LRUNode>();
        this.memory = new LRUDLL();
    }
    
    public int get (int key) {
        if (!map.containsKey(key)) return -1;
        memory.deleteNodePointer(map.get(key));
        memory.insertAtEnd(map.get(key));

        return  map.get(key).value;
    }
    
    public void put (int key, int value) {
        if (map.containsKey(key)) {
            memory.deleteNodePointer(map.get(key));
        } else if (map.size() >= cap) {
            map.remove(memory.head.key);
            memory.deleteAtBeginning();
        }
        map.put(key, new LRUNode(key, value));
        memory.insertAtEnd(map.get(key));
    }
}