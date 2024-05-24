package com.johnny.data.structures.linkedlists;

public class Main {
    public static void main(String[] args) {
//        createNewNode();
        appendNode();
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
