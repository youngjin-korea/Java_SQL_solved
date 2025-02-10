import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> suffixArr = new ArrayList();
        for(int i = 0; i < my_string.length(); i++){
            suffixArr.add(my_string.substring(i));
        }
        return suffixArr.contains(is_suffix) ? 1 : 0;
    }
}