import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);  // 배열을 오름차순으로 정렬

        int count = 0;
        int i = 0;
        int j = N - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == M) {
                count++;
                i++;
                j--;
            } else if (sum < M) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(count);
    }
}
