import java.io.*;
import java.lang.*;
import java.util.*;

class ArrayUnionWithDuplicates {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            // Reading the first array
            String line1 = read.readLine().trim();
            String[] numsStr1 = line1.split(" ");
            int[] a = new int[numsStr1.length];
            for (int i = 0; i < numsStr1.length; i++) {
                a[i] = Integer.parseInt(numsStr1[i]);
            }

            // Reading the second array
            String line2 = read.readLine().trim();
            String[] numsStr2 = line2.split(" ");
            int[] b = new int[numsStr2.length];
            for (int i = 0; i < numsStr2.length; i++) {
                b[i] = Integer.parseInt(numsStr2[i]);
            }

            // Calling doUnion method and printing the result
            System.out.println(findUnion(a, b));

            System.out.println("~");
        }
    }
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<a.length; i++){
            set.add(a[i]);
        }
        for(int j = 0; j<b.length; j++){
            set.add(b[j]);
        }
        return set.size();
    }
}

