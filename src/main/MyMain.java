package main;

import implementation.MySinglyCircularLinkedList;

public class MyMain {
    public static void main(String[] args) {
        MySinglyCircularLinkedList circularLinkedList = new MySinglyCircularLinkedList();
        circularLinkedList.traverse();
        System.out.println(circularLinkedList.size());
        circularLinkedList.addFirst(20);
        circularLinkedList.addLast(10);
        circularLinkedList.addLast(30);
        circularLinkedList.traverse();
        System.out.println(circularLinkedList.removeFirst());
        circularLinkedList.traverse();
        System.out.println(circularLinkedList.size());
    }
}
