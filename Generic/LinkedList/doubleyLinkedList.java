package Generic.LinkedList;

public class doubleyLinkedList {
    int size;

    doubleyLinkedList() {
        size = 0;
    }

    Node head;
    Node tail;

    class Node {

        int value;
        Node prev;
        Node next;

        Node(int val) {
            this.value = val;
        }

        Node(int val, Node p, Node n) {
            this.value = val;
            this.prev = p;
            this.next = n;
        }


    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("-> " + temp.value);
            temp = temp.next;
        }
        System.out.print("-> END");
    }

    // Insertion

    public void insertAtFirst(int value) {

// Method - 1 (Basic)
        /*
        if (head == null) {
            Node newNode = new Node(value);
            head = newNode;
        } else {

            Node newNode = new Node(value);
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = null;
            head = newNode;
        }
        */

        Node newNode = new Node(value);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size += 1;
    }

    public void insertBetween(int index, int value) {
        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            insertAtEnd(value);
        } else {

            Node newNode = new Node(value);

            // using nextNode
            /*
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = nextNode;
            newNode.prev = newNode;

             */

            // Method - 2 using without nextNode
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next.prev = newNode.next;

        }
    }

    public void insertAtEnd(int value) {
        if (head == null) {
            insertAtFirst(value);
        }

        Node temp = head;

        // traverse the temp to the last element
        while (temp.next != null) {
            temp = temp.next;
        }

        // to add the newNode
        Node newNode = new Node(value);
        temp.next = newNode;
        newNode.prev = temp;
        temp = newNode;

        // make next as null
        temp.next = null;
    }

    public void getReverse() {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print("-> " + temp.value);
            temp = temp.prev;
        }
    }

    public void reverse() {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp.prev != null) {
            temp.next = temp.prev;
            temp = temp.next;
        }
    }

}
