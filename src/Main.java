// Author: Alden Sahi
// Date: 03/20/2024
// Project: LinkedList Implementation in Java
// Project Description: We will create a LinkedList in java to dynamically store data.
// This is for practice to help reinforce emy understanding of data structures.



public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.show();
        list.insertAtStart(3);
        list.show();
        list.insertAtStart(2);
        list.show();
        list.insertAtStart(1);
        list.show();
        list.insertAtEnd(4);
        list.show();
        list.replaceAt(2,2);
        list.show();
        list.countNodes();

    }

}