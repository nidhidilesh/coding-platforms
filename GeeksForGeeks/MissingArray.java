//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class MissingArray {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        Arrays.sort(arr);
        //System.out.println(arr[n-2]);
        int digit = 0;
        for(int i = 0;i<n-1;i++){
            if(arr[n-2]!=n){
                digit = n;
            }
            else if(arr[0]!=1){
                digit = 1;
            }
            else{
                if(i!=n-2 && arr[i+1]-arr[i]!=1){
                    digit = arr[i]+1;
                }
            }
        }
        return digit;
        // Your Code Here
    }
}