//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class Anagrams {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        HashMap<Character, Integer> hashMap = new HashMap<Character,Integer>();
        int l1 = s1.length();
        int l2 = s2.length();
        for(int i = 0;i<l1;i++){
            char c1 = s1.charAt(i);
            int value = 0;
            if(hashMap.containsKey(c1)){
                value = hashMap.get(c1);
            }
            hashMap.put(c1,value+1);
        }
        for(int j = 0;j<l2;j++){
            char c2 = s2.charAt(j);
            int value = 0;
            if(hashMap.containsKey(c2)){
                value = hashMap.get(c2);
                if(value>0){
                    hashMap.put(c2,value-1);
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}