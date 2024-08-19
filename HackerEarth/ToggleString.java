import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class ToggleString{
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int length = input.length();
        String resultStr = "";
        for(int i = 0;i<length;i++){
            String letter = input.substring(i,i+1);
            if(isLowerCase(letter)){
                resultStr += letter.toUpperCase();
            }
            else if(isUpperCase(letter)){
                resultStr += letter.toLowerCase();
            }
        }
        System.out.println(resultStr);
    }
    public static boolean isLowerCase(String letter){
        char[] character = letter.toCharArray();
        if(character[0]>=97 && character[0]<=122){
            return true;
        }
        return false;
    }
    public static boolean isUpperCase(String letter){
        char[] character = letter.toCharArray();
        if(character[0]>=65 && character[0]<=90){
            return true;
        }
        return false;
    }
}

