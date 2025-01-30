package OOPS.Polymorphism;

public class MethodOverLoading {
    static void addition(int num1, int num2){
        System.out.println("Addition(int) : "+(num1 + num2));
    }
    static void addition(double num1, double num2){
        System.out.println("Addition(float): "+(num1 + num2));
    }

    static int mulitiple(int a, int b, int c){
        return a * b * c;
    }

    static int multiple(double a, double b, double c){
        return (int) (a * b * c);
    }


}
