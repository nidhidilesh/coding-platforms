//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
//{ Driver Code Starts.

public class NextPermutation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
    static void nextPermutation(int[] arr) {
        // code here
        int l = arr.length;
        int index = -1;
        //find the index which is less than its next number
        for(int i = l-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        //if no index found, reverse the array
        if(index == -1){
            reverse(arr,0,l);
        }
        else{
            //sort the part after index and 
            //swap the next big element with the element at index
            Arrays.sort(arr, index+1, l);
            for(int i = index+1; i<l;i++){
                if(arr[index] < arr[i]){
                    swap(index, i, arr);
                    break;
                }
            }
        }
    }
    
    public static void swap(int a, int b, int[] array){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static void reverse(int[] array, int start, int end){
        int mid = end/2;
        int temp = end - 1;
        for(int j = 0;j < mid; j++){
            swap(j, temp, array);
            temp--;
        }
    }
}
// } Driver Code Ends