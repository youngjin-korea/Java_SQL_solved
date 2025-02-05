import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> countUp = new ArrayList();
        for(int i = start_num; i <= end_num; i++){
            countUp.add(i);
        }
        
        int[] intCountUp = new int[countUp.size()];
        for(int j = 0; j < countUp.size(); j++){
            intCountUp[j] = countUp.get(j);
        }
        return intCountUp;
    }
}