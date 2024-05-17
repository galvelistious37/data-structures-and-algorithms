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
