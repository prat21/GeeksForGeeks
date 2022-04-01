package com.geeksforgeeks.datastructure.linkedlist;

import java.util.HashMap;
import java.util.Map;

/*
Given a linked list, check if the linked list has loop or not.
https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
 */
public class FindLoopLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode("12");
        list.addNode("5");
        list.addNode("58");
        list.addNode("2");
        list.addNode("33");
        list.addNode("15");

        list.printList();
        System.out.println("");
        list.tail.next = list.head.next.next;  //Create loop in linked list

        System.out.println(detectLoop(list));
    }

    static boolean detectLoop(LinkedList list) {
        boolean loopDetected = false;
        LinkedList.Node temp=list.head;
        Map<LinkedList.Node,Object> nodeMap = new HashMap<>();
        Object obj = new Object();

        while(!loopDetected && temp!=null){
            if(nodeMap.containsKey(temp))
                loopDetected = true;
            else {
                nodeMap.put(temp,obj);
                temp = temp.next;
            }
        }
        return loopDetected;
    }
}


