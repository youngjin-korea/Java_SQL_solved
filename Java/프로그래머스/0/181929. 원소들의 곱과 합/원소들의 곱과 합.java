class Solution {
    public int solution(int[] num_list) {
        int sumDouble=1;
        int AllMulti=0;
        
        for(int item : num_list){
            sumDouble *= item;
        }
        
        for(int item: num_list){
            AllMulti += item;
        }
        AllMulti = (AllMulti*AllMulti);
        int answer = 0; 
        answer= sumDouble<AllMulti ? 1 : 0;
        
       
        return answer;
    }
}