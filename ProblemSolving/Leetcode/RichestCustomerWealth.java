package ProblemSolving.Leetcode;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
    int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts) {
        int Rowmax = 0;
        int max = 0;
        for (int row = 0; row < accounts.length; row++) {
            Rowmax = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                Rowmax += accounts[row][col];
            }
            if(Rowmax > max){
                max = Rowmax;
            }
        }
        return max;
    }
}
