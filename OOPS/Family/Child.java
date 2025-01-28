package OOPS.Family;

public class Child extends Parent{
    String name = "Rithesh";
    Child(){
        super();
        System.out.println("Iam Rithesh(Child Class)" + "\nSon of "+super.name+"\nGrand son of "+super.Father);
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}


