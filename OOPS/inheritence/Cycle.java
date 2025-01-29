package OOPS.inheritence;

public class Cycle {
    int gears;
    int speed;
    Cycle(int g, int s){
        this.gears = g;
        this.speed = s;
    }

    void speedUp(){
        speed += 10;
    }
    void  speedDown()
    {

    }
}
