package OOPS.Polymorphism;

import java.time.Period;

public class Son extends PolyFamily {
    @Override
    void whoIam(){
        System.out.println("Iam Son");
    }

    public static void main(String[] args) {
        PolyFamily s = new Son();
        s.whoIam();
    }
}
