//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class StockBuyAndSellSingle {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int prices[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                prices[i] = Integer.parseInt(arr[i]);
            }
            int res = maximumProfit(prices);
            System.out.println(res);
        }
    }
    public static int maximumProfit(int prices[]) {
        // Code here
        int profit = 0;
        int min = prices[0];
        int l = prices.length;
        /*we traverse the array from the start,
        find out a minimum
        then check if its next element is bigger, then we subtract it
        if it is smaller than min, then that element will be our new min*/
        
        for(int i = 1; i < l; i++){
            if(prices[i] > min){
                profit = Math.max(profit, prices[i] - min);
            }
            else{
                min = prices[i];
            }
        }
        
        return profit;
    }
}
// } Driver Code Ends
