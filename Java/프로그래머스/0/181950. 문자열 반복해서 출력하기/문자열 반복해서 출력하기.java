import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      String str = st.nextToken();
      Integer n = Integer.parseInt(st.nextToken());
      
      StringBuffer sb = new StringBuffer();
      for(int i=0; i<n; i++){
          sb.append(str);
      }
      System.out.println(sb.toString());
    }
}