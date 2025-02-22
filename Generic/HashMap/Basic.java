package Generic.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Enter the size of Map : ");
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            int intTemp = s.nextInt();
            String stringTemp = s.nextLine();
            map.put(intTemp, stringTemp);
        }

        for (var num : map.entrySet()) {
            System.out.println("Key " + num.getKey() + " Value : " + num.getValue());
        }
    }
}