class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyingPrice=Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++)                // Buying day
        {
            int sellingPrice=prices[i];                   // Current day price i.e. selling price.

            if(sellingPrice > buyingPrice)
            {
                if(sellingPrice-buyingPrice > profit)
                {
                    profit = sellingPrice-buyingPrice;
                }
            }
            else
            {
                buyingPrice = sellingPrice;
            }
        }
        return profit;
    }
}