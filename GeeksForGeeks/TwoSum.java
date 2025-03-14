import java.io.*;
import java.util.*;

public class TwoSum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            // int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[0]);

            String line = br.readLine();
            String[] tokens = line.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            boolean ans = twoSum(arr, x);
            System.out.println(ans ? "true" : "false");
            // System.out.println("~");

            System.out.println("~");
        }
    }
    static boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i<arr.length; i++){
            int complement = target - arr[i];
            if(set.contains(complement)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
        
    }
}
