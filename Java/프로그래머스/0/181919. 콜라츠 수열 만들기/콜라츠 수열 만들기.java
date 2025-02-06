import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list_result = new ArrayList();
        list_result.add(n);
        int temp = n;
        while(temp != 1){
            if(temp % 2 == 0){
                temp /= 2;
            }else{
                temp = 3 * temp + 1;
            }
            list_result.add(temp);
        }
        
        int[] answer = new int[list_result.size()];
        
        for(int i = 0; i < list_result.size(); i++){
            answer[i] = list_result.get(i);
        }
        
        return answer;
    }
}