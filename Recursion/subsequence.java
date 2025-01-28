package Recursion;

import java.util.ArrayList;

public class subsequence {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String word = "abc";
        subsequence(word, "");
        System.out.println(list);
    }

    static void subsequence(String word, String ans){
        if(word.length() == 0) {
            list.add(ans);
            return;
        }
        subsequence(word.substring(1), ans + word.charAt(0));
        subsequence(word.substring(1), ans);
    }
}
