package ProblemSolving.LeetCode150;

public class FactorialTrailingZeroes_172M {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
        for (int i = 2; i <= n ; i++) {
            sum = sum * i;
        }

        System.out.println(sum);
      trailingZeroes(n, 1);
    }
    public static void   trailingZeroes(int n, int sum) {
        if(n == 1){
            return;
        }
        System.out.println(sum);
        trailingZeroes(n-1, sum * n);
    }
}
