//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Arrays;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class WaveArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            convertToWave(arr);
            StringBuffer sb = new StringBuffer("");
            for (int i : arr) {
                sb.append(i + " ");
            }
            System.out.println(sb.toString());
            System.out.println("~");
        }
    }
    public static void convertToWave(int[] arr) {
        // code here
        int loop = 0;
        int l = arr.length;
        if(l%2 == 0){
            loop = l-1;
        }
        else{
            loop = l-2;
        }
        for(int i = 0, j = i+1; i<loop; i=i+2, j = i+1){
            swap(arr, i, j);
        }
        
    }
    public static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
