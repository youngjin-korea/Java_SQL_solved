class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String odd="";
        String dou = "";
        for(int item: num_list){
            if(item%2 == 1){
                odd += (item+"");
            }else{
                dou += (item+"");
            }
        }
        
        answer = Integer.parseInt(odd)+Integer.parseInt(dou);
        return answer;
    }
}