import java.io.*;
import java.util.*;

class FreqInALimitedArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            List<Integer> result = frequencyCount(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
            }
        }
    }
    public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        List<Integer> list = new ArrayList<Integer>(Collections.nCopies(arr.length,0));
        for(int i = 0; i<arr.length; i++){
            if(list.get(arr[i]-1) == null){
                list.set(arr[i]-1, 1);
            }
            else{
                list.set(arr[i]-1, list.get(arr[i]-1)+1);
            }
            
        }
        return list;
    }
}
