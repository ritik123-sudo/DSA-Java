package Java_Basics;

public class BuyandSell {
    public static int maxProfit(int[] prices) {
        int b=0;
        int s=0;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<prices[b]){
                b=i;
                s=i;
            }
            maxProfit=Math.max(maxProfit,prices[s]-prices[b]);
            s++;
        }
        
        return maxProfit ;        
    }

    public static void main(String[] args) {
        int prices[]={7};
        System.out.println(maxProfit(prices));
    }
}
