package Recursion;
import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {
        String word = "nivqewfin";
//        // convert word to Character Array
//        char[] arr = word.toCharArray();
//        // getting palindrome of the word
//        String wordPlain = palindrome(arr);
//
//        boolean isPalindrome = checkPalindrome(word, wordPlain);
//        System.out.println(isPalindrome);
boolean result = recursivePalindrome(word, 0, word.length() - 1);
        System.out.println(result);
    }

    static boolean checkPalindrome(String word, String wordPlain){
        // Checking Palindrome using Ternary operator
        return word.equalsIgnoreCase(wordPlain) ? true :  false;
    }
    static String palindrome(char[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        return new String(arr);
    }
    static boolean recursivePalindrome(String word, int start , int end){
            if(start > end){
               return true;
            }

            if(word.charAt(start) != word.charAt(end)){
                return false;
            }

            return recursivePalindrome(word, start + 1, end - 1);
    }
}
