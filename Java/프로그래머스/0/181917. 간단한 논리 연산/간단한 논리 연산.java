class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean p1 = false;
        boolean p2 = false;
        
        if(x1 == true || x2 == true){
            p1 = true;
        }
        if(x3 == true || x4 == true){
            p2 = true;
        }
        
        if(p1 == false || p2 == false){
            return false;
        }else{
            return true;
        }
        
    }
}