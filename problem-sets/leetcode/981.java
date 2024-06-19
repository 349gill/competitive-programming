import java.util.HashMap;
import java.util.ArrayList;

// Time-Value pairs for a particular Key
public class Pair<time, value> { 
  public int time;
  public String value;
    
  public Pair(int time, String value) { 
    this.time = time; 
    this.value = value;
  }
} 

class TimeMap {
    
    private HashMap<String, ArrayList<Pair>> map;
    
    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (this.map.get(key) == null) {
            ArrayList<Pair> list = new ArrayList<>();
            list.add(new Pair<>(timestamp, value));
            map.put(key, list);
            return;
        }
        else {
            this.map.get(key).add(new Pair<>(timestamp, value));
        }
    }
    
    public String get(String key, int timestamp) {
        if (this.map.get(key) == null) {
            return "";
        }
        ArrayList<Pair> list = this.map.get(key);
        int L = 0, R = list.size() - 1, M = 0;
        while (L <= R) {
            M = (L + R) / 2;
            if (list.get(M).time == timestamp) {
                return list.get(M).value;
            }
            else if (list.get(M).time < timestamp) {
                L = M + 1;
            }
            else {
                R = M - 1;
            }
        }
        
        if (M == 0 && list.get(M).time > timestamp) {
            return "";
        }
        if (list.get(M).time > timestamp) {
            M--;
        }
        
        return list.get(M).value;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */