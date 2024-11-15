//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int l = arr.size();
        //loop to calculate groups of k digits in the array and add 1 for incomplete group
        int loop = l/k + ((l%k==0) ? 0 : 1);
        int start = 0;
        //newStart will be the start for the next loop
        int newStart = start+k;
        //end will be calculated based on start and a check will be made to see if it is less than the array length
        int end = (start+k-1>l-1) ? l-1 : (start+k-1);
        while(loop>0){
            while(start<end){
                swap(start,end, arr);
                start++;
                end--;
            }
            loop--;
            start = newStart;
            newStart = start+k;
            end = (start+k-1>l-1) ? l-1 : (start+k-1);
        }
    }
    public void swap(int start, int end, ArrayList<Long> arr){
        Long temp = arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);
    }
}

//{ Driver Code Starts.

public class ReverseArrayInGroups {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            ArrayList<Long> arr = new ArrayList<>();
            Scanner ss = new Scanner(input);
            while (ss.hasNextLong()) {
                arr.add(ss.nextLong());
            }
            Solution ob = new Solution();
            ob.reverseInGroups(arr, k);
            for (long num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends