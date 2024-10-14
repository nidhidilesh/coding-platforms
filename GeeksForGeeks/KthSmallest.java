//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class KthSmallest {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, key));
        }
        out.flush();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int left = 0;
        int l = arr.length;
        int mid = 0;
        int pivot = l-1;
        quicksearch(arr, left, pivot, k);
		return arr[k-1];
    }
    public static void quicksearch(int[] arr, int left, int pivot, int k) {
		int right = pivot - 1;
		if(left>right) {
			return;
		}
		while(left<right) {
			
			while(arr[left]<arr[pivot] && left<right) {
				left++;
			}
			while(arr[right]>arr[pivot] && left<right) {
				right--;
			}
			if(left!=right) {
				swap(arr, left, right);
			}
		}
		if(arr[left]>arr[pivot]) {
			swap(arr, left, pivot);
		}
		if(k-1<=left) {
			quicksearch(arr, 0, left,k);
		}
		else{
			quicksearch(arr, left+1, pivot, k);
		}
	}
    private static void swap(int[] arr, int left, int pivot) {
		int temp = arr[left];
		arr[left] = arr[pivot];
		arr[pivot] = temp;
	}
}
