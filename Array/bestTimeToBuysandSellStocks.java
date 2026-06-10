public class bestTimeToBuysandSellStocks {
    public static void main(String[] args) {
        int []arr={7,1,5,3,6,4};
        System.out.println(bestTimeTOBuySell(arr));
        
    }
    public static int bestTimeTOBuySell(int []arr){
        int min=arr[0];
        int maxProfit=0;
        for(int i=1;i<arr.length;i++){
            int cost=arr[i]-min;
            maxProfit=Math.max(maxProfit,cost);
            min=Math.min(min, arr[i]);
        }
        return maxProfit;
    }
}
