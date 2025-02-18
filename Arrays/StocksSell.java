public class StocksSell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        System.out.println("Maximum profit:"+getMaxProfit(arr));
    }   
    static int getMaxProfit(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<arr.length;i++){
            if(buyPrice > arr[i]) {
                buyPrice = arr[i];
            } else{
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
