//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RotateArray {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int d = Integer.parseInt(in.readLine().trim()); // rotation count (key)
            int n = array.size();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = array.get(i);

            new Solution().rotateArr(arr, d); // rotating the array
            StringBuilder sb = new StringBuilder();

            // printing the elements of the array
            for (int value : arr) sb.append(value).append(" ");
            out.println(sb.toString().trim());

            out.println("~");
        }
        out.flush();
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int len = arr.length;
        int[] tempArray = new int[len];
        //initally the lastIndex will be index of the last element in the array
        int lastIndex = len-1;
        //calculate lastIndex by looping for d times
        for(int i = 1;i<=d;i++){
            lastIndex = (lastIndex + 1)%len;
        }       
        //copy original array from d to lastIndex into a temporary array.
        int j = 0;
        for(int i = d; ;i++,j++){
            i = i%len;
            tempArray[j] = arr[i];
            if(i==lastIndex)break;
        }
        //copy temp array back to original array
        System.arraycopy(tempArray, 0, arr, 0, len);
    }
}