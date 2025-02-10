import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> suffixList = new ArrayList();
        for(int i = 0; i < my_string.length(); i++){
            suffixList.add(my_string.substring(i));
        }
        Collections.sort(suffixList);
        return suffixList.toArray(new String[0]);
    }
}