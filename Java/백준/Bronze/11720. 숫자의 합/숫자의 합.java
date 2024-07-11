import java.util.*;

public class Main {
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();  // 이 라인이 추가되어야 합니다.
        String a = in.nextLine();
        in.close();
        String[] arr = a.split("");
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += Integer.parseInt(arr[i]);  // 문자 값을 정수로 변환
        }
        System.out.print(sum);
    }
}
