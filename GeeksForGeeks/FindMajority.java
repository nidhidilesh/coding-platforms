//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class FindMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            //Solution ob = new Solution();
            List<Integer> ans = findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }

    public static List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        
        for(int i : nums){
            if(map.get(i)!=null){
                map.put(i, map.get(i)+1);
            }
            else map.put(i, 1);
        }
        int k = nums.length/3;
        List<Integer> list = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) > k){
                list.add(i);
            }
        }
        return list;
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    
}
