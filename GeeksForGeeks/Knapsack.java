package com.nidhi;

import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
	int value, weight;

	Item(int x, int y) {
		this.value = x;
		this.weight = y;
	}
}
class ProfitComparator implements Comparator<Item> {

	@Override
	public int compare(Item arg0, Item arg1) {
		double r1 = (double)arg0.value/arg0.weight;
		double r2 = (double)arg1.value/arg1.weight;
		if(r1>r2) {
			return -1;
		}
		else if(r1<r2) {
			return 1;
		}
		return 0;
	}

}
public class Knapsack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String inputLine[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine[0]);
			int w = Integer.parseInt(inputLine[1]);
			Item[] arr = new Item[n];
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0, k = 0; i < n; i++) {
				arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
			}
			System.out.println(String.format("%.6f", new Solution().fractionalKnapsack(w, arr, n)));
		}
	}
}
// } Driver Code Ends

/*
 * class Item { int value, weight; Item(int x, int y){ this.value = x;
 * this.weight = y; } }
 */

class Solution {
	// Function to get the maximum total value in the knapsack.
	double fractionalKnapsack(int w, Item arr[], int n) {
		// Your code here
		
		Arrays.sort(arr, new ProfitComparator());
		double sum = 0d;
		double temp = 0d;
		for(int i = 0;i<n;i++) {
			if(w>=arr[i].weight) {
				w -= arr[i].weight;
				sum += arr[i].value;
			}
			else {
				temp = (double)arr[i].value/arr[i].weight;
				sum += (double)(temp*w);
				break;
			}
		}
		return sum;
	}
}