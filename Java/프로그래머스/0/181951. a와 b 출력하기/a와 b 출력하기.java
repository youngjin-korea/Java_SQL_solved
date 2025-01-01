import java.io.*;
import java.util.*;
public class Solution {
    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        
        StringTokenizer st = new StringTokenizer(input);
        
        String a = st.nextToken();
        String b = st.nextToken();
        
        System.out.printf("a = %s \nb = %s", a, b);
    }
}