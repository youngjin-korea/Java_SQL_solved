import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer answer = new StringBuffer();
        boolean[] delete = new boolean[my_string.length()];
        for(int i : indices){
            delete[i] = true;
        }
        for(int i = 0; i < my_string.length(); i++){
            if(!delete[i]){
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}