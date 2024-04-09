
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

    Node root = null; // ptr to root node

    public void insert(int data) {

        root = insertRecursion(root, data);

    }

    public Node insertRecursion(Node root, int data) {

        // we can still have a root with this code "if (root.left == null && root.right
        // == null)"
        // we need to check if the ptr to root is null
        if (root == null) {
            root = new Node(data);
        }
        // if data is less than the root
        else if (data < root.data) {
            // now we will need to update root to make a subtree
            root.left = insertRecursion(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursion(root.right, data);
        }

        // at the end of these if else statements it will find a null/vacant spot

        return root;

    }

    // InOrder: left root right
    // PreOrder: root left right
    // PostOrder: left right root
    public void inOrder() {
        inOrderRecursion(root);
    }

    public void inOrderRecursion(Node root) {

        // INORDER IMPLEMENTATION
        if (root != null) {
            // this will recursively call itself until it finds smallest value
            // can easily be rearranged to fit printing style needed
            inOrderRecursion(root.left);
            System.out.print(root.data + " ");
            inOrderRecursion(root.right);
        }

    }

}
