class Solution {
    public int[] solution(int[] num_list) {
        int arrLength = num_list.length;
        
      int lastNum = num_list[arrLength-1] > num_list[arrLength-2] ? 
          num_list[arrLength-1] - num_list[arrLength-2] :  
          num_list[arrLength-1]*2;
        
        int[] result = new int[arrLength+1];
        for(int i=0; i<arrLength; i++){
            result[i] = num_list[i];
        }
        result[arrLength] = lastNum;
        return result;
    }
}