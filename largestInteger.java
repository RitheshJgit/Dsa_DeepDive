import java.util.Scanner;

public class largestInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three Numbers : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        // Method 1
        /*
        if(a > b && a > c){
            System.out.println(a + " is greater");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is greater");
        }
        else {
            System.out.println(c + " is greater");
        }
         */
        // Method 2
        int max = Math.max(a, Math.max(b, c));
        System.out.println(max);
    }
}
