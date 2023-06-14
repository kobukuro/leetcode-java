// Array, Dynamic Programming
public class BestTimeToBuyAndSellStock121 {
    /*
        Time Complexity : O(n), only a single pass is needed.
        Space Complexity : O(1)
     */
    public int maxProfit(int[] prices) {
        int res = 0;
        int buyPrice = prices[0];
        for (int price : prices) {
            res = Math.max(res, price - buyPrice);
            if (price < buyPrice) {
                buyPrice = price;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(new BestTimeToBuyAndSellStock121().maxProfit(prices)); // 5
    }
}
