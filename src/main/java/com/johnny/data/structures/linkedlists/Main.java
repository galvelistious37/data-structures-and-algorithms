package com.johnny.data.structures.linkedlists;

public class Main {
    public static void main(String[] args) {
//        createNewNode();
//        appendNode();
//        exampleGet();
//        exampleSet();
//        exampleInsert();
//        exampleRemove();
//        exampleReverse();
//        findMiddleNode();
//        findKthFromEnd();
        partitionList();
    }

    private static void partitionList() {
        // Create a new LinkedList and append values to it
        LinkedList ll = new LinkedList(3);
        ll.append(8);
        ll.append(5);
        ll.append(10);
        ll.append(2);
        ll.append(1);

        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        ll.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        ll.partitionList(5);

        // Print the list after partitioning
        System.out.println("LL after partitionList:");
        ll.printList(); // Output: 3 2 1 5 8 10
    }

    private static void findKthFromEnd() {
        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        System.out.println(myList.findKthFromEnd(2).value); // Output: Node with value 4

        System.out.println(myList.findKthFromEnd(5).value); // Output: Node with value 1
//
        System.out.println(myList.findKthFromEnd(6)); // Output: null
    }

    private static void findMiddleNode() {
        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        System.out.println(myList.findMiddleNode().value); // Output: 3

        myList.append(6);
        System.out.println(myList.findMiddleNode().value); // Output: 4
    }

    private static void exampleReverse() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.printList();
        System.out.println();
        System.out.println("Reverse the order");
        myLinkedList.reverse();
        myLinkedList.printList();
    }

    private static void exampleRemove() {
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
        myLinkedList.printList();
        System.out.println();
        System.out.println("Remove Node");
        myLinkedList.remove(2);
        myLinkedList.printList();
    }

    private static void exampleInsert() {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(2);
        myLinkedList.printList();
        System.out.println();
        System.out.println("Insert a node");
        myLinkedList.insert(1, 1);
        myLinkedList.printList();
    }

    private static void exampleSet() {
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
        myLinkedList.printList();
        System.out.println();
        System.out.println("Set an index");
        myLinkedList.set(1, 4);
        myLinkedList.printList();
    }

    private static void exampleGet(){
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();

        System.out.println("Get an index");
        System.out.println(myLinkedList.get(2).value);

    }

    private static void appendNode() {
        System.out.println("Appending");
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();
        System.out.println();

        System.out.println("Remove Last");
        // Returns Node 3
        System.out.println(myLinkedList.removeLast().value);
        // Returns Node 2
        System.out.println(myLinkedList.removeLast().value);
        // Returns Node 1
        System.out.println(myLinkedList.removeLast().value);
        // Returns null
        System.out.println(myLinkedList.removeLast());
        System.out.println();

        System.out.println("Prepending");
        myLinkedList.prepend(2);
        myLinkedList.prepend(3);
        myLinkedList.prepend(4);
        myLinkedList.printList();
        System.out.println();

        System.out.println("Remove First");
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.removeFirst());
        System.out.println();
        System.out.println();
    }

    private static void createNewNode(){
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(11);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
    }
}
