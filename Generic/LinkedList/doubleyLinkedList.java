package Generic.LinkedList;

public class doubleyLinkedList {
    int size;
    doubleyLinkedList(){
        size = 0;
    }
    Node head;
    Node tail;
   class Node{

       int value;
       Node prev;
       Node next;

       Node(int val){
            this.value = val;
       }


   }

   public void display(){
       Node temp = head;
      while(temp != null) {
          System.out.print("-> " + temp.value);
          temp = temp.next;
       }
       System.out.print("-> END");
   }

   public void insertAtFirst(int value){
       if (head == null){
           Node temp = new Node(value);
           head = temp;
           tail = temp;
           head.prev = null;
           tail.next = null;
       }

       Node newNode = new Node(value);
       newNode.next = head;
       head.prev = newNode;
       head = newNode;

       size += 1;
   }

}
