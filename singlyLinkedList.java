/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package galladorait20b;

/**
 *
 * @author admin
 */
public class singlyLinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    Node Head;

    void add(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
            return;
        }
        Node current = Head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void display() {
        Node current = Head;

        while (current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void displaynodes() {
        Node current = Head;

        while (current != null) {
            System.out.println("Data: " + current.data);
            System.out.println(" | Current pointers: " + current);
            System.out.println(" | Next: ");

            if (current.next != null) {
                System.out.println(current.next);
            } else {
                System.out.println("null");
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display();
        System.out.println(list.Head);
        list.displaynodes();
    }
}
