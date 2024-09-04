//{ Driver Code Starts
import java.io.*;
import java.util.*;

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

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.duplicates(arr);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends



class ArrayDuplicates{
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        int l = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int count = 1;
        for(int i = 0;i<l;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> a  : map.entrySet()){
            //System.out.println(a.getKey()+ " "+a.getValue());
            if(a.getValue()>1){
                list.add(a.getKey());
            }
        }
        Collections.sort(list);
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
}
