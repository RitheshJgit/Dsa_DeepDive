package Recursion;

public class powerOfNumber {
    public static void main(String[] args) {
        int num = 3;
        int power = 3;
        int ans = recursion(num, power);
        System.out.println(ans);
    }
    static int recursion(int num, int power){

        if(power == 0){
            return 1;}
        return num * recursion(num, power - 1);
    }
}
