package Generic.LinkedList;

public class circularLinkedList {
    Node tail;
    Node head;
    class Node{
        int value;
        Node next;

        Node(int val){
            this.value = val;
        }
    }

    public void insertAtBeginning(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void display(){
        Node temp = head;

        do {
            System.out.println("-> " + temp.value);
            temp = temp.next;
        } while (temp != head);

    }
}
