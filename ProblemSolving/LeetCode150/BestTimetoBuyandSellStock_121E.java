package ProblemSolving.LeetCode150;

public class BestTimetoBuyandSellStock_121E {
    public static void main(String[] args) {
        int[] prices = {};
        maxProfit( prices);
    }
    public static int maxProfit(int[] prices){
        // Profit For Today
        int pft = 0;
        // least buy product
        int lbp = Integer.MAX_VALUE;
        // Total Profit
        int tp = 0;

        for (int i = 0; i < prices.length; i++) {
            // check for cheap rate
            if(prices[i] < lbp){
                lbp = prices[i];
            }

            // check for today profit
            pft = prices[i] - lbp;

            if(tp < pft){
                tp = pft;
            }
        }

        return tp;
    }
}
