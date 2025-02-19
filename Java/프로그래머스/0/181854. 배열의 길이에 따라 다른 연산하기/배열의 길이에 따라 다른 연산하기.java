class Solution {
    public int[] solution(int[] arr, int n) {
        String isEven = arr.length%2 == 0 ? "even" : "odd";
        switch(isEven){
            case "even" :
                for(int i = 0; i < arr.length; i++){
                    if(i%2 == 1){
                        arr[i] += n;
                    }
                }
                break;
            case "odd" : 
                for(int i = 0; i < arr.length; i++){
                    if(i%2 == 0){
                        arr[i] += n;
                    }
                }
                break;
        }
        
        return arr;
        
    }
}