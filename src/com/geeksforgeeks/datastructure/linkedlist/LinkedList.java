package com.geeksforgeeks.datastructure.linkedlist;

public class LinkedList{
    Node head= null;
    Node tail = null;

    public void addNode(String element){
        if(head==null) {
            head = new Node(element);
            tail = head;
        }
        else{
            tail.next = new Node(element);
            tail = tail.next;
        }
    }

    void printList(){
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.element);
            if(temp.next!=null)
                System.out.print("->");
            temp=temp.next;
        }
    }

    static class Node{
        String element;
        Node next;

        Node(String element){
            this.element=element;
            next=null;
        }

        public String getElement() {
            return element;
        }

        public void setElement(String element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
