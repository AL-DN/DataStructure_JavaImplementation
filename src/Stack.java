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

    public int pop() {
       Node firstnode = top;
       top = top.next;
       return firstnode.data;
    }

    public int peek() {
        return top.data;
    }
    public void show() {
        try {
            Node node = top;
            String list = "";
            while(node.next != null) { // this throws NullPointerException b/c it is trying to access node.next on a node that doesnt exist
                String num = Integer.toString(node.data);
                list  += num+" ";
                node = node.next;
            }
            // need to add last node / if there is only one node since these both have null pointers
            list += Integer.toString(node.data);
            System.out.println("The current Stack is " + list);
        } catch (NullPointerException e) {
            System.out.println("There are no nodes in LinkedList to show.");
        }

    } // end of show()
}
