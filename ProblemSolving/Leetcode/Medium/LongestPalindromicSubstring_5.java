package ProblemSolving.Leetcode.Medium;

public class LongestPalindromicSubstring_5 {
    public static void main(String[] args) {
        String word = "bakbashasgadd";
        StringBuilder str = new StringBuilder(word);
        boolean isPalindrome = (str.reverse() == str) ? true : false;
        System.out.println(isPalindrome);
    }
}
