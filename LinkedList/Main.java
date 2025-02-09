package LinkedList;

public class Main extends Ll{
    public static void main(String[] args) {
        Ll list = new Ll();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(40);
        list.insertAtFirst(30);
        list.insertAtLast(50);
        list.insertAfterMethod_1(25,5);
        list.display();
    }
}
