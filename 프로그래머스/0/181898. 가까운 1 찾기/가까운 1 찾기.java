class Solution {
    public int solution(int[] arr, int idx) {
      if(arr.length - 1 <= idx){
          return -1;
      }  
        
      for(int i = idx; i < arr.length; i++ ){
          if(arr[i] == 1){
              return i;
          }
      }
        
      return -1;  
    }
}