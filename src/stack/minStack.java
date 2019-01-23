package stack;

public class minStack {
    private Node head;

    private class Node {
        int value;
        int min;
        Node next;

        private Node(int value, int min, Node next){
            this.value = value;
            this.min = min;
            this.next = next;

        }
    }

    private void push(int x) {
        if(head == null) {
            head = new Node(x,x,null);
        } else {
//            System.out.println(x + "    " + head.min);
//            System.out.println(Math.min(x, head.min));
            head = new Node(x, Math.min(x, head.min), head);
        }
    }

    private void pop() {
        head = head.next;
        head.min = head.next.value;
    }

    private int top() {
        return head.value;

    }

    private int getMin() {
        return head.min;
    }

    public static void main(String args[]) {
        minStack obj = new minStack();
        obj.push(-2);
        obj.push(-3);
        obj.push(-1);



        obj.pop();
        int param_3 = obj.top();
        System.out.println("popped element" + param_3);

        int param_4 = obj.getMin();
        System.out.println("Current minimum" + param_4);

    }
}


//  Your MinStack object will be instantiated and called as such:

