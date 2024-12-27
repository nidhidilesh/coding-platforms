//{ Driver Code Starts
// Initial Template for Java.
import java.io.*;
import java.util.*;

public class StockByAndSellMultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading number of test cases (t)
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            // Read the line of integers (prices)
            String arr[] = br.readLine().split(" ");
            int prices[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                prices[i] = Integer.parseInt(arr[i]);
            }

            // Create an instance of the Solution class

            // Call the stockBuyAndSell method
            int res = maximumProfit(prices);

            // Print the result
            System.out.println(res);

            // Print the "~" symbol to match the original output
            System.out.println("~");
        }
    }
    public static int maximumProfit(int prices[]) {
        // code here
        int l = prices.length;
        int start = -1;
        int end = -1;
        int profit = 0;
        for(int i = 0;i<l-1;i++){
            
            if(prices[i] < prices[i+1] && start == -1){
                start = i;
                end = -1;
            }
            else if(prices[i] >= prices[i+1] && end == -1){
                end = i;
            }
            if(prices[i] < prices[i+1] && (i+1 == l-1)){
                end = l-1;
            }
            if(start>-1 && end>-1){
                profit += prices[end] - prices[start];
                start = -1;
                end = -1;
            }
        }
        return profit;
    }
}
// } Driver Code Ends
