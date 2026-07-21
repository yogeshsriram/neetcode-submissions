class MinStack {
    Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> minstack = new ArrayDeque<>();


    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        } else{
            int curr = Math.min(val, minstack.peek());
            minstack.push(curr);
        }
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
