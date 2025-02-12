import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
         int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        if (dice[0] == dice[3]) { // 네 개의 주사위가 모두 같은 경우
            return 1111 * dice[0];
        }
        
        if (dice[0] == dice[2] || dice[1] == dice[3]) { // 세 개가 같을 경우
            int p = dice[1]; // 세 개가 같은 값
            int q = (dice[0] == dice[2]) ? dice[3] : dice[0]; // 나머지 하나의 값
            return (int) Math.pow(10 * p + q, 2);
        }
        
        if (dice[0] == dice[1] && dice[2] == dice[3]) { // 두 개씩 같은 경우
            int p = dice[0], q = dice[2];
            return (p + q) * Math.abs(p - q);
        }
        
        if (dice[0] == dice[1]) { // 두 개만 같은 경우 (앞쪽 두 개가 같음)
            return dice[2] * dice[3];
        }
        if (dice[1] == dice[2]) { // 가운데 두 개가 같음
            return dice[0] * dice[3];
        }
        if (dice[2] == dice[3]) { // 뒤쪽 두 개가 같음
            return dice[0] * dice[1];
        }
        
        return dice[0]; // 네 개가 모두 다른 경우
        
    }
}