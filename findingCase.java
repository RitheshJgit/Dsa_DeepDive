import java.util.Scanner;

public class findingCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any Word : ");
        char c = s.next().charAt(0);
        if(c >= 'a' && c <= 'z'){
            System.out.println("lowercase");
        }
        else if(c >= 'A' && c <= 'Z'){
            System.out.println("UPPERCASE");
        }
        else {
            System.out.println("Enter Any Word!!");
        }
    }
}
