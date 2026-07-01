class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int profit=prices[j]-prices[i];
        //         maxProfit=Math.max(maxProfit,profit);
        //     }
        // }
        // return maxProfit;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-min;
            min=Math.min(min,prices[i]);
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
        
    }
}