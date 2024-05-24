package com.johnny.data.structures.linkedlists;

public class Main {
    public static void main(String[] args) {
//        createNewNode();
        appendNode();
    }

    private static void appendNode() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        // Returns Node 3
        System.out.println(myLinkedList.removeLast().value);
        // Returns Node 2
        System.out.println(myLinkedList.removeLast().value);
        // Returns Node 1
        System.out.println(myLinkedList.removeLast().value);
        // Returns null
        System.out.println(myLinkedList.removeLast());

        myLinkedList.prepend(4);
        myLinkedList.prepend(5);
        myLinkedList.prepend(6);

        myLinkedList.printList();
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
