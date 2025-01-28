import java.util.Scanner;
public class AgeEligiblity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the Required Age to purchase the game ? ");
        int requiredAge = s.nextInt();

        System.out.println("Enter the Age of People: ");
        int age = s.nextInt();
        if(age >= requiredAge){
            System.out.println("You're Eligible.");
        }
        else {
            System.out.println("Soory you're not eligible.");
        }
    }
}
