public class LinkedList {

    Node head; // first node

    // inserts node at the end!
    public void insertF(int data) {
        Node node = new Node(); // creates new node obj
        node.data = data;   // assigns integer to node.data
        // Now the question is where do we put this node?!

        // CASE 1: First Node to be added
        if (head == null) {
           head = node;
        // CASE 2: Other Nodes Exist
        } else {
            Node n = head;
            while(n.next!=null) {
                n = n.next;
            }
            n.next=node;
        }
    } // end of  insertF function

    // if given index longer than list it will only replace last node
    // replaces data in existing node
    void replaceAt(int insert_index, int data) {
        Node h = head;
        // iterates until the desired node
        // before the desired index if found
        for(int i = 0 ; i < insert_index; i++) {
            h= h.next;
            i++;
        }
        h.data = data;
    } // end of replace at function

    // now we need to insert node in new node



    public void show() {
        Node node = head;
        while(node.next!=null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}