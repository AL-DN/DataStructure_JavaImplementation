public class Stack {
    Node top = null;

    public void push(int data) {
        Node node = new Node(data);
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }

    }

    public void show() {
        Node n = top;
        while(n != null) {
            System.out.println(n.data);
           n = n.next;
        }
    }
}
