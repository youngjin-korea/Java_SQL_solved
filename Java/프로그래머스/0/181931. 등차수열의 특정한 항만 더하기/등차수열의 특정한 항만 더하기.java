class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] numArr = new int[included.length];
        int num = a;
        int sum = 0;
        
        for(int i=0; i<numArr.length; i++){
            numArr[i] = num;
            num += d; 
        }
        for(int i=0; i<included.length; i++){
            if(included[i] == true){
               sum += numArr[i];
            }
        }
        return sum;
    }
}