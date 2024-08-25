import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    // Reading input from STDIN
        int N = Integer.parseInt(br.readLine());
        String[] arrayOfInt = br.readLine().split(" ");
        long[] array = new long[N];
        long answer = 1;
        for(int i = 0;i<N;i++){
            array[i] = Long.parseLong(arrayOfInt[i]);
            answer = (answer*array[i]) % ((long)Math.pow(10,9) + 7);
        }
        System.out.println(answer);
    }
}
