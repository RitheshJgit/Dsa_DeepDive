package Generic.LinkedList;

public class Main extends doubleyLinkedList{
    public static void main(String[] args) {
        doubleyLinkedList dl = new doubleyLinkedList();
        dl.insertAtFirst(30);
        dl.insertAtFirst(20);
        dl.insertAtFirst(10);
        dl.display();
        dl.insertBetween(1,25);
        System.out.println();
        dl.display();
    }
}
