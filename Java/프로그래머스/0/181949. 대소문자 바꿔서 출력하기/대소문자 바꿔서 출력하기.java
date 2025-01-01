import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] inputToChar = input.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        for(char a : inputToChar){
            if(Character.isUpperCase(a)){
                sb.append(Character.toLowerCase(a));
            }else{
                sb.append(Character.toUpperCase(a));
            }
        }
        
        System.out.println(sb.toString());
    }
}