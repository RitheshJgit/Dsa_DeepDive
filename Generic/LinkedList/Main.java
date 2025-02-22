package Generic.LinkedList;

public class Main extends doubleyLinkedList {
    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.display();
    }
}
