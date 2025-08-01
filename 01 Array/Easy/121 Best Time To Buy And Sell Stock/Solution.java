class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<minBuy){
                minBuy=prices[i];
            }
            if(maxProfit<(prices[i]-minBuy)){
                maxProfit = prices[i]-minBuy;
            }
        }
        return maxProfit;
    }
}