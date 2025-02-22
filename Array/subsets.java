package Array;

import java.util.Arrays;

public class subsets {
    public static void main(String[] args) {
        String word = "abc";
        System.out.println(word.substring(0,3));
        int n = word.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(word.substring(i,j));
            }
        }

    }
}
