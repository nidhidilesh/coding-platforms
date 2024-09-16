//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s = new Stack();
        char[] strChar = x.toCharArray();
        int l = x.length();
        int count = 0;
        for(int i = 0;i<l;i++){
            switch(strChar[i]){
                case '[':
                    s.push('[');
                    count++;
                    break;
                case '{':
                    s.push('{');
                    count++;
                    break;
                case '(':
                    s.push('(');
                    count++;
                    break;
                case ']':
                    if(!s.empty() && s.peek()=='['){
                        count--;
                        s.pop();
                    }
                    else{
                        return false;
                    }
                    break;
                case '}':
                    if(!s.empty() && s.peek()=='{'){
                        count--;
                        s.pop();
                    }
                    else{
                        return false;
                    }
                    break;
                case ')':
                    if(!s.empty() && s.peek()=='('){
                        count--;
                        s.pop();
                    }
                    else{
                        return false;
                    }
                    break;
            }
        }
        if(count==0)return true;
        else return false;
    }
}
