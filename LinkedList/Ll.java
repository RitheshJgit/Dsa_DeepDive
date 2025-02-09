package LinkedList;


// Linked List
public class Ll {
    /*
    Ll contain
    head as start node
    tail as last node
     */
    Node head;
    Node tail;
    int size;

    // intailize with size ny calling constructor
    Ll() {
        size = 0;
    }

    // Insert the value in the empty Linked list
    public void insertAtFirst(int val) {
        // Creating linked list
        Node node = new Node(val);
        // Point the node to the head
        node.next = head;
        // assign the node as head
        head = node;

        // assign tail if it's empty
        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" -> " + temp.value);
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Head - > : " + head.value + " Tail - > : " + tail.value);
    }

    public void insertAtLast(int value) {
        // create a node
        Node temp = new Node(value);

        // check if the node is empty
        if (head == null) {
            insertAtFirst(value);
        }

        tail.next = temp;
        tail = temp;

        size += 1;
    }

    public void insertAfterMethod_1(int val, int index) {
        if (index == 0) {
            insertAtFirst(val);
        } else if (index == size) {
            insertAtLast(val);
        } else {
            Node temp1 = head;

            for (int i = 0; i < index; i++) {
                temp1 = temp1.next;
            }

            // temp2 contain address of temp1.next
            Node temp2 = temp1.next;

            // create newNode
            Node newNode = new Node(val);

            // point the newNode to temp2 for join before
            newNode.next = temp2;

            // use temp1 to insert after the correct index
            temp1.next = newNode;

            size += 1;
        }
    }

    // Ll contain Nodes
    public class Node {

        // Every node contain value and next pointers
        int value;

        // next contain Node address
        Node next;

        // Node contain only the value
        Node(int val) {
            this.value = val;
        }

        // Node contain both value and Address of the node
        Node(int val, Node add) {
            this.value = val;
            this.next = add;
        }
    }

}
