package OOPS.Abstract;

import java.sql.SQLOutput;

public class Rectangle extends Shapes {
    int length;
    int breath;
    int area;
    Rectangle(int l, int b){
        this.length = l;
        this.breath = b;
    }

    @Override
    int area() {
        this.area = length * breath;
        return area;
    }

    @Override
    void getShape() {
        System.out.println("Area of Rectangle : " + this.area);
    }
}
