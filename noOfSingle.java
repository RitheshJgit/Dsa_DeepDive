import java.util.Scanner;

public class noOfSingle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = s.nextInt();
        System.out.println("Enter single digit : ");
        int num = s.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == num){
                count ++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
