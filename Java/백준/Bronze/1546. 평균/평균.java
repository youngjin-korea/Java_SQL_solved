import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        double sum = 0,max = 0; 

        for(int j =0; j<N; j++){
             arr[j] = sc.nextDouble();
            if(arr[j] > max){
                max = arr[j];
            }
            sum += arr[j];
        }

        System.out.print(sum/max*100.0/N);
    }
}