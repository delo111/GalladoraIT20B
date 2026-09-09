/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package galladorait20b;

/**
 *
 * @author admin
 */
public class doublyLinkedList {
    class Node {

        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
            this.previous=null;
            this.next =null;
        }

    }
    Node head;
    void add(int data){
        Node newNode = new Node (data);
        if (head == null) {
            head=newNode;
            return;
            
        }
        Node current = head;
        while(current.next != null){
            current=current.next;
            
        }
        
    }
}