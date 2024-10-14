//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class isPalindrome {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        int l = S.length();
        int mid= l/2;
        int j = l-1;
        for(int i = 0;i<mid;i++){
            if(S.charAt(i) != S.charAt(j)){
                return 0;
            }
            j--;
        }
        return 1;
    }
};