package ProblemSolving.Leetcode;

public class FindTheFirstOccurance {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "de";

         int n = strStr(haystack, needle);
        System.out.println(n);
    }
    public static int strStr(String haystack, String needle) {
        StringBuilder st = new StringBuilder(haystack);
        return st.indexOf(needle);
    }
}
