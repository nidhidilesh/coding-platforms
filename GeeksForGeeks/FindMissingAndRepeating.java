//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class FindMissingAndRepeating {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
    static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int r = -1;
        int m = -1;
        int[] freq = new int[arr.length+1];
        for(int num : arr){
            freq[num]++;
        }
        for(int i = 0; i<=arr.length; i++){
            if(freq[i]>1){
                r = i;
            }
            else if(freq[i]==0){
                m = i;
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(r);
        list.add(m);
        return list;
        
    }
}