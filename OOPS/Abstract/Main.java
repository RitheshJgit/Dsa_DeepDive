package OOPS.Abstract;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(10);
        Rectangle r = new Rectangle(10, 20);
        s.area();
        s.getShape();
        r.area();
        r.getShape();
    }
}

