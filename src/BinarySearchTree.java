
// these nodes are a little different with pointers to left and right 
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}


public class BinarySearchTree {

    Node root;

    public void insert(int data) {
        // Create node for insertion
        Node node = new Node(data);

        // if the root node is pointing to nothing the first to be inserted will be root
        if(root.left == null && root.right == null) {
            root = new Node(data);
        }
        else if (data < root.data) {
            root.left = node;
        }
        else if (data > root.data) {
            root.right = node;
        
        
    }
    
}
