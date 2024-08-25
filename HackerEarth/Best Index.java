import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class AddArrays {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());   
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArr = new int[N];
        for(int i = 0;i<N;i++){
            intArr[i]=Integer.parseInt(st.nextToken());
        }
        long max = Long.MIN_VALUE;
        long sum=0;
        for(int j = 0;j<N;j++){
            sum = 0;
            //k will be updated to index value of an array
            int k = j;
            int loop=1;
            //if loop is greater than N-k (remaining elements) then stop the loop
            while(N-k>=loop){
                for(int l = 0;l<loop;l++){
                    sum += intArr[k];
                    k++;
                }
                loop++;
            }
            if(sum>max)max=sum;
        }
        System.out.println(max);
    }
}
