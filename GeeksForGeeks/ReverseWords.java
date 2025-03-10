//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class ReverseWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String regex = "\\.";
        String strArray[] = str.split(regex);
        int len = strArray.length;
        String result = "";
        for(int i = len-1;i>0;i--){
            result = result + strArray[i]+".";
        }
        result = result + strArray[0];
        return result;
    }
}