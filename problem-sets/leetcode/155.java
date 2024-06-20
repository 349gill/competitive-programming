class Pair {
    public int value;
    public int min;
    
    public Pair(int value, int min) {
        this.value = value;
        this.min = min;
    }
}

class MinStack {
    private ArrayList<Pair> list;
    
    public MinStack() {
        this.list = new ArrayList<>();
    }
    
    public void push(int val) {
        Pair p = new Pair(val, val);
        if (this.list.size() == 0) {
            this.list.add(p);
            return;
        }
        if (this.list.get(this.list.size() - 1).min < val) {
            p.min = this.list.get(this.list.size() - 1).min;
        }
        this.list.add(p);
    }
    
    public void pop() {
        this.list.remove(this.list.size() - 1);
    }
    
    public int top() {
        return this.list.get(this.list.size() - 1).value;
    }
    
    public int getMin() {
        return this.list.get(this.list.size() - 1).min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */