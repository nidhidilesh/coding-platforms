//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class EquilibriumPoint {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            long[] arr = new long[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.equilibriumPoint(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        // Your code here
        long left = 0l;
        long sum = Arrays.stream(arr).sum();
        int l = arr.length;
        for(int j = 0;j<l;j++){
            sum -= arr[j];
            if(sum == left){
                return j+1;
            }
            left += arr[j];
        }
        return -1;
    }
}
