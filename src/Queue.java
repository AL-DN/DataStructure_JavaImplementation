// Author: Alden Sahi
// Date: 03/27/2024
// Class: Queue.java
// Class Description: A queue is a data structure based off of a linked list. It data is organized in a FIFO order.
// I think of a queue just like a line to the cash register. First person to walk in will be first person checked out. People will also
// populate the line in order of who got there first.

public class Queue {
    Node front = null;
    // Enqueue: Adding a node to the Queue
    public void enqueue(int data) {
        //create new node
        Node node = new Node(data);

        if (front == null) {
            front = node;
        } else {
            Node n = front;
            while(n.next != null) {
                n= n.next;
            }
            n.next = node;
        }

    }
    // Dequeue: Pop() removing node from queue and returning data inside
    // Peek() just taking a look at the first node in Queue. Nothing is added or removed

    public void show() {
        try {
            Node node = front;
            String list = "";
            while(node.next != null) { // this throws NullPointerException b/c it is trying to access node.next on a node that doesnt exist
                String num = Integer.toString(node.data);
                list  += num+" ";
                node = node.next;
            }
            // need to add last node / if there is only one node since these both have null pointers
            list += Integer.toString(node.data);
            System.out.println("The current queue is = " + list);
        } catch (NullPointerException e) {
            System.out.println("There are no nodes in Queue to show.");
        }

    } // end of show()


}
