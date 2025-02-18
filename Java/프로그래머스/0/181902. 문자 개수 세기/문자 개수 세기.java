class Solution {
    private static final int SIZE = 26; 
    
    public int[] solution(String my_string) {
         int[] answer = new int[2*SIZE];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if('a' <= c && 'z' >= c){
                answer[c - 'a' + SIZE] ++;
            }
            if(c >= 'A' && c <= 'Z'){
                answer[c - 'A'] ++;
            }
        }
        return answer;
    }
}