// Author: Alden Sahi
// Date: 03/20/2024
// Project: Data Structure Implementation in Java
// Project Description: We will make our own java implementation of LinkedList, Stack, and Queue.




public class Main {
    public static void main(String[] args) {
        /* LinkedList list = new LinkedList();
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
        list.insertAtIndex(1,4);
        list.show();
        list.countNodes(); */

        Stack stacky = new Stack();
        stacky.push(8);
        stacky.push(2);
        stacky.show();
        System.out.println(stacky.pop());
        System.out.println(stacky.peek());
    }

}