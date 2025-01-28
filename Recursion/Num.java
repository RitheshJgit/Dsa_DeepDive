package Recursion;

public class Num {
    public static void main(String[] args) {
        recursion(1);
    }

    public static void recursion(int n){
        if(n >= 5){
            return;
        }
        System.out.print("First : " + n);
        n = n +2;
        recursion(n+1);

        System.out.println(" Second : " + n);
    }
}
