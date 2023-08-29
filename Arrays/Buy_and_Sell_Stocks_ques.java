// ASSIGNMENT ARRAYS --> QUESTION : 
/* 3 } You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock
  on  the ith day.Return the maximum profit you can achieve from this transaction.
 If you cannot achieve any profit, return 0. given prices[7,1,5,3,6,4] */

package Arrays;

public class Buy_and_Sell_Stocks_ques {
    public static int buyandsellstock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { //profit
                int profit = prices[i] - buyPrice;//today's profit 
                maxprofit = Math.max(maxprofit, profit);

            } else {
                buyPrice = prices[i];
            }

        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyandsellstock(prices));
    }

}
