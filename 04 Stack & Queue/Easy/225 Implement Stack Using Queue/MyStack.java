
// Approach 1 using 2 queue
class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();  

    public MyStack() {   }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        while(q1.size()>1){
            q2.offer(q1.poll());
        }

        int ans = q1.poll();

        Queue temp = q2;
        q2 = q1;
        q1 = temp;
        return ans;  
    }
    
    public int top() {
        while(q1.size()>1){
            q2.offer(q1.poll());
        }

        int front = q1.poll();
        q2.offer(front);

        Queue temp = q2;
        q2 = q1;
        q1 = temp;

        return front;   
    }
    
    public boolean empty() {
        return q1.isEmpty();    
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

// Approach2 - Using 1 queue

 class MyStack {
    Queue<Integer> q1 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.offer(x); 
    }
    
    public int pop() {

        int n = q1.size();
        for(int i=0; i<n-1; i++){
            q1.offer(q1.poll());
        }
        int ans = q1.poll();
        return ans;
    }
    
    public int top() {
        int n = q1.size();
        for(int i=0; i<n-1; i++){
            q1.offer(q1.poll());
        }
        int front = q1.poll();
        q1.offer(front);
        return front;   
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */