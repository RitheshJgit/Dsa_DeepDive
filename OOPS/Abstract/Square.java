package OOPS.Abstract;

public class Square extends Shapes {
    int side;
    int area;
    Square(int s){
        this.side = s;
    }
    @Override
    int area(){
        this.area = this.side * this.side;
        return this.area;
    }
    @Override
    void getShape(){
        System.out.println("Area of Square: " + this.area);
    }
}
