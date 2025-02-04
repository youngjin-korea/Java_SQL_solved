class Solution {
    public int solution(String num_str) {
        String[] arr = num_str.split("");
        int[] arrInt = new int[arr.length];
        int sum = 0;
        
        for(int i = 0; i<arr.length; i++){
            arrInt[i] = Integer.valueOf(arr[i]);
        }
        
        for(int i = 0; i<arrInt.length; i++){
            sum += arrInt[i];
        }
       
        return sum;
    }
}