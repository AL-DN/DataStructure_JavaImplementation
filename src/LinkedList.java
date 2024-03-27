public class LinkedList {

    // REMEMBER: head is just a pointer to a Node object
    // we can manipulate this by assigning it to another node object
    Node head = null;

    // inserts node at the end!
    public void insertAtEnd(int data) {
        Node node = new Node(data); // creates new node obj
        // Now the question is where do we put this node?!
        // CASE 1: First Node to be added
        if (head == null) {
           head = node;
        // CASE 2: Other Nodes Exist
        } else {
            Node n = head; // pointer to the same mem address as head (first node)
            // we can then traverse it using n.next without harming original links
            while(n.next!=null) {
                n = n.next;
            }
            n.next=node;
        }
    } // end of  insertAtEnd function

    public void insertAtStart(int data) {
        // need new node
        Node node = new Node(data);
        // remember head is a pointer that stores a memory address which allows us to be able to assign it to another pointer node.next
        // this makes our new node point to the mem address of the original first node
        node.next = head;
        // makes head point to the memory address of our new node now completing the links and making it the first node!!
        head = node;
    }

    public void insertAtIndex(int index,int data){
        //create a node
        Node node = new Node(data);
        Node n = head;
        if(index == 0){
            node.next = head;
            head = node;
        } else {
            // iterate to index before node will be inserted (we will put node in between this one and next)
            for(int i=0; i<index-1;i++) {
                n = n.next;
            }
            // connect new nodes next pointer to n.next
            node.next = n.next;
            // connect the node pointed to by n to node
            n.next = node;
        }


    }

    // if given index longer than list it will only replace last node
    // replaces data in existing node
    void replaceAt(int insert_index, int data) {
        Node h = head; // copy of pointer
        // iterates until the desired node
        for(int i = 0 ; i <= insert_index; i++) {
            h= h.next;
            i++;
        }
        h.data = data;
    } // end of replace at function

    public void countNodes() {
        int count;
        if(head == null) { // if list is empty
            count = 0;
        } else {
            Node n = head;
            count = 1;
            while(n.next!=null) { // increments count everytime
                count+=1;
                n=n.next;
            }
        }

        System.out.println("There are " + count + " in the Linked List");
    }
    public void show() {
        try {
            Node node = head;
            String list = "";
            while(node.next != null) { // this throws NullPointerException b/c it is trying to access node.next on a node that doesnt exist
                String num = Integer.toString(node.data);
                list  += num+" ";
                node = node.next;
            }
            // need to add last node / if there is only one node since these both have null pointers
            list += Integer.toString(node.data);
            System.out.println("The current list is " + list);
            } catch (NullPointerException e) {
            System.out.println("There are no nodes in LinkedList to show.");
            }

    } // end of show()
}
