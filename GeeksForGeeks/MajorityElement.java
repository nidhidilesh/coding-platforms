import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		majorityElement(arr);
	}

	    static void majorityElement(int arr[]) {
	        // your code here
	        Map<Integer,Integer> map = new HashMap<>();
	        int l = arr.length;
	        //int majority = -1;
	        int count = 0;
	        for(int i = 0;i<l;i++){
	            if(map.containsKey(arr[i])){
	                count = map.get(arr[i]);
	                map.put(arr[i],++count);
	            }
	            else{
	                map.put(arr[i],1);
	            }
	        }
	        int i = map.entrySet().stream().filter(a -> a.getValue()>l/2).map(Map.Entry::getKey).findFirst().orElse(-1);
	        System.out.println(i);
	    }
	}