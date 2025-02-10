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


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" -> " + temp.value);
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Head - > : " + head.value + " Tail - > : " + tail.value);
    }
    public Node getIndex(int index){
        if(index == 0){
            return head;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }
    public void find(int value){

        // check for the Node existence
        boolean isFound = false;
        // handle the empty List
        if(size ==0 ){
            System.out.println("List is Empty");
        }

        else {
            Node temp = head;
            for (int i = 0; i < size; i++) {
                if(temp.value == value){
                    isFound = true;
                    System.out.println("Node Found at : " + i);
                }
                temp = temp.next;
            }
            if(!isFound){
                System.out.println("Can't find the Node");
            }
        }
    }

    // INSERTION
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

    // DELETION
    public void deleteAtFirst(){

        // move the head to delete the very first node
        head = head.next;

        // If we have only one Node
        if(head == null){
            tail = null;
        }

        size -= 1;
    }
    public void deleteAtAny(int index){
        if (index == 0) {
            deleteAtFirst();
        } else if (index == size) {
            deleteAtLast();
        }
        else {
            // get the previous Node
            Node prevNode = getIndex(index);

            // print the value of node deleted
            System.out.println(prevNode.next.value);

            // delete the element
            prevNode.next = prevNode.next.next;
        }
    }
    public void deleteAtLast(){
        // if we have the one node use deleteFirst method
        if(size == 1){
            deleteAtFirst();
        }

        // Assign temp
        Node temp = head;

        // to reach the secondLast node
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        // get last element value
        int deletedValue = temp.next.value;

        // bring tail to the secondLast Node
        tail = temp;

        // Print the deleted value
        System.out.println(deletedValue);


        tail.next = null;

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
