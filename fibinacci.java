import java.util.Scanner;

public class fibinacci
{
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 ....
        Scanner s = new Scanner (System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int n = s.nextInt();
        int count = 2;
        int prev = 1;
        int prePrev = 1;
        while(count < n){
            int temp = prev;
            prev = temp + prePrev;
            System.out.println(prev);
            prePrev = temp;
            count ++;
        }
    }
}
