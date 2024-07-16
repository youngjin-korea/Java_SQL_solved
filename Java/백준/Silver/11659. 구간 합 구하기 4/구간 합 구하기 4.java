import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        arr[0] = 0; 
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            sum = arr[i-1] + Integer.parseInt(st.nextToken());
            arr[i] = sum;
        }
       
        for(int i=1; i<=M; i++){
           st = new StringTokenizer(br.readLine());
           int start = Integer.parseInt(st.nextToken());
           int end = Integer.parseInt(st.nextToken());
           int result = arr[end]-arr[start-1];
           sb.append(result+"\n");
        }
        System.out.print(sb.toString());
    }
}